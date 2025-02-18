
//
// This file is auto-generated. Please don't modify it!
//
package android.libs.scanlibrary.src.main.jni.sdk.java.src.org.opencv.photo;

import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Mat;
import org.opencv.utils.Converters;

// C++: class MergeMertens
//javadoc: MergeMertens
public class MergeMertens extends MergeExposures {

    protected MergeMertens(long addr) { super(addr); }


    //
    // C++:  float getContrastWeight()
    //

    //javadoc: MergeMertens::getContrastWeight()
    public  float getContrastWeight()
    {
        
        float retVal = getContrastWeight_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  float getExposureWeight()
    //

    //javadoc: MergeMertens::getExposureWeight()
    public  float getExposureWeight()
    {
        
        float retVal = getExposureWeight_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  float getSaturationWeight()
    //

    //javadoc: MergeMertens::getSaturationWeight()
    public  float getSaturationWeight()
    {
        
        float retVal = getSaturationWeight_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  void process(vector_Mat src, Mat& dst, Mat times, Mat response)
    //

    //javadoc: MergeMertens::process(src, dst, times, response)
    public  void process(List<Mat> src, Mat dst, Mat times, Mat response)
    {
        Mat src_mat = Converters.vector_Mat_to_Mat(src);
        process_0(nativeObj, src_mat.nativeObj, dst.nativeObj, times.nativeObj, response.nativeObj);
        
        return;
    }


    //
    // C++:  void process(vector_Mat src, Mat& dst)
    //

    //javadoc: MergeMertens::process(src, dst)
    public  void process(List<Mat> src, Mat dst)
    {
        Mat src_mat = Converters.vector_Mat_to_Mat(src);
        process_1(nativeObj, src_mat.nativeObj, dst.nativeObj);
        
        return;
    }


    //
    // C++:  void setContrastWeight(float contrast_weiht)
    //

    //javadoc: MergeMertens::setContrastWeight(contrast_weiht)
    public  void setContrastWeight(float contrast_weiht)
    {
        
        setContrastWeight_0(nativeObj, contrast_weiht);
        
        return;
    }


    //
    // C++:  void setExposureWeight(float exposure_weight)
    //

    //javadoc: MergeMertens::setExposureWeight(exposure_weight)
    public  void setExposureWeight(float exposure_weight)
    {
        
        setExposureWeight_0(nativeObj, exposure_weight);
        
        return;
    }


    //
    // C++:  void setSaturationWeight(float saturation_weight)
    //

    //javadoc: MergeMertens::setSaturationWeight(saturation_weight)
    public  void setSaturationWeight(float saturation_weight)
    {
        
        setSaturationWeight_0(nativeObj, saturation_weight);
        
        return;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  float getContrastWeight()
    private static native float getContrastWeight_0(long nativeObj);

    // C++:  float getExposureWeight()
    private static native float getExposureWeight_0(long nativeObj);

    // C++:  float getSaturationWeight()
    private static native float getSaturationWeight_0(long nativeObj);

    // C++:  void process(vector_Mat src, Mat& dst, Mat times, Mat response)
    private static native void process_0(long nativeObj, long src_mat_nativeObj, long dst_nativeObj, long times_nativeObj, long response_nativeObj);

    // C++:  void process(vector_Mat src, Mat& dst)
    private static native void process_1(long nativeObj, long src_mat_nativeObj, long dst_nativeObj);

    // C++:  void setContrastWeight(float contrast_weiht)
    private static native void setContrastWeight_0(long nativeObj, float contrast_weiht);

    // C++:  void setExposureWeight(float exposure_weight)
    private static native void setExposureWeight_0(long nativeObj, float exposure_weight);

    // C++:  void setSaturationWeight(float saturation_weight)
    private static native void setSaturationWeight_0(long nativeObj, float saturation_weight);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
