package com.principle.liskovsubstitution;

public abstract class Cloud {

    public abstract void MachineLearning();

}

interface ITranslatable {
    void Translate();
}

class AWS extends Cloud implements ITranslatable {

    @Override
    public void Translate() {
        System.out.println("AWS Translate");
    }

    @Override
    public void MachineLearning() {
        System.out.println("AWS Machine Learning");
    }
}

class Azure extends Cloud {

    @Override
    public void MachineLearning() {
        System.out.println("Azure Machine Learning");
    }
}
class Google extends Cloud implements ITranslatable {

    @Override
    public void Translate() {
        System.out.println("Google Translate");
    }

    @Override
    public void MachineLearning() {
        System.out.println("Google Machine Learning");
    }
}


class Test{
    public static void main(String[] args) {

        Cloud cloud = new AWS();
        cloud.MachineLearning();
        new AWS().Translate();

        cloud = new Google();
        cloud.MachineLearning();
        new Google().Translate();

        cloud = new Azure();
        cloud.MachineLearning();

    }
}
