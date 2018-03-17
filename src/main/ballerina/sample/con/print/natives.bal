package sample.con.print;

public struct PrintConnector {
}

public native function <PrintConnector printConnector> initPrinter();
public native function <PrintConnector printConnector> printText(string text) (boolean);