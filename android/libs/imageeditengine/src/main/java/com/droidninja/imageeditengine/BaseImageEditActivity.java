package android.libs.imageeditengine.src.main.java.com.droidninja.imageeditengine;

import android.graphics.Matrix;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseImageEditActivity extends AppCompatActivity {

  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
  }

  public static int[] getBitmapOffset(ImageView img,  Boolean includeLayout) {
    int[] offset = new int[2];
    float[] values = new float[9];

    Matrix m = img.getImageMatrix();
    m.getValues(values);

    offset[0] = (int) values[5];
    offset[1] = (int) values[2];

    if (includeLayout) {
      ViewGroup.MarginLayoutParams lp = (ViewGroup.MarginLayoutParams) img.getLayoutParams();
      int paddingTop = (int) (img.getPaddingTop() );
      int paddingLeft = (int) (img.getPaddingLeft() );

      offset[0] += paddingTop + lp.topMargin;
      offset[1] += paddingLeft + lp.leftMargin;
    }
    return offset;
  }
}
