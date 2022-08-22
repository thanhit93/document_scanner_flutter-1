package android.libs.scanlibrary.src.main.java.com.scanlibrary.camera;

import android.graphics.drawable.Drawable;
import android.net.Uri;

public interface IMainActivity {
    void setCameraFrontFacing();

    void setCameraBackFacing();

    boolean isCameraFrontFacing();

    boolean isCameraBackFacing();

    void setFrontCameraId(String cameraId);

    void setBackCameraId(String cameraId);

    String getFrontCameraId();

    String getBackCameraId();

    void hideStatusBar();

    void showStatusBar();

    void hideStillshotWidgets();

    void showStillshotWidgets();

    void toggleViewStickersFragment();

    void addSticker(Drawable sticker);

    void setTrashIconSize(int width, int height);

    void saveImage(Uri uri);
}
