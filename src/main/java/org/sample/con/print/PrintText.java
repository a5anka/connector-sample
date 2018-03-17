package org.sample.con.print;

import org.ballerinalang.bre.Context;
import org.ballerinalang.bre.bvm.CallableUnitCallback;
import org.ballerinalang.model.NativeCallableUnit;
import org.ballerinalang.model.types.TypeKind;
import org.ballerinalang.model.values.BBoolean;
import org.ballerinalang.natives.annotations.Argument;
import org.ballerinalang.natives.annotations.BallerinaFunction;
import org.ballerinalang.natives.annotations.Receiver;
import org.ballerinalang.natives.annotations.ReturnType;

@BallerinaFunction(
        packageName = "sample.con.print",
        functionName = "printText",
        receiver = @Receiver(type = TypeKind.STRUCT, structType = "PrintConnector",
                structPackage = "sample.con.print"),
        args = {@Argument(name = "text", type = TypeKind.STRING)},
        returnType = {@ReturnType(type = TypeKind.BOOLEAN)},
        isPublic = true
)
public class PrintText implements NativeCallableUnit {

    @Override
    public void execute(Context context, CallableUnitCallback callableUnitCallback) {
        System.out.println("**** Action printText called ****");
        String text = context.getStringArgument(0);
        System.out.println("**** " + text + " ****");
        context.setReturnValues(new BBoolean(true));
        callableUnitCallback.notifySuccess();
    }

    @Override
    public boolean isBlocking() {
        return true;
    }
}
