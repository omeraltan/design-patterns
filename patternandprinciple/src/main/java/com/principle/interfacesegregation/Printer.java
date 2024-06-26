package com.principle.interfacesegregation;

interface IPrint{
    void print();
}

interface IScan{
    void scan();
}

interface IFax{
    void fax();
}

interface IPrintDuplex{
    void printDuplex();
}

class HPPrinter implements IPrint, IScan, IFax, IPrintDuplex {

    @Override
    public void fax() {

    }

    @Override
    public void print() {

    }

    @Override
    public void printDuplex() {

    }

    @Override
    public void scan() {

    }
}

class SamsungPrinter implements IPrint, IFax{

    @Override
    public void fax() {

    }

    @Override
    public void print() {

    }
}

class LexmarkPrinter implements IPrint, IScan, IFax{

    @Override
    public void fax() {

    }

    @Override
    public void print() {

    }

    @Override
    public void scan() {

    }
}

public class Printer {

}
