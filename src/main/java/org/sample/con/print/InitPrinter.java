package org.sample.con.print;

import org.ballerinalang.bre.Context;
import org.ballerinalang.bre.bvm.CallableUnitCallback;
import org.ballerinalang.model.NativeCallableUnit;
import org.ballerinalang.model.types.TypeKind;
import org.ballerinalang.natives.annotations.BallerinaFunction;
import org.ballerinalang.natives.annotations.Receiver;

@BallerinaFunction(
        packageName = "sample.con.print",
        functionName = "initPrinter",
        receiver = @Receiver(type = TypeKind.STRUCT, structType = "PrintConnector",
                             structPackage = "sample.con.print"),
        args = {},
        isPublic = true
)
public class InitPrinter implements NativeCallableUnit {

    @Override
    public void execute(Context context, CallableUnitCallback callableUnitCallback) {
        System.out.println("********************** Printer init is called **********************");
    }

    @Override
    public boolean isBlocking() {
        return false;
    }
}
