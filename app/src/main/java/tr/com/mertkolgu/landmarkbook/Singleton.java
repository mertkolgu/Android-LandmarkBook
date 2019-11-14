package tr.com.mertkolgu.landmarkbook;

import android.graphics.Bitmap;

class Singleton {
    private Bitmap chosenImage;
    private static Singleton singleton;

    private Singleton() {
    }

    static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    Bitmap getChosenImage() {
        return chosenImage;
    }

    void setChosenImage(Bitmap chosenImage) {
        this.chosenImage = chosenImage;
    }
}
