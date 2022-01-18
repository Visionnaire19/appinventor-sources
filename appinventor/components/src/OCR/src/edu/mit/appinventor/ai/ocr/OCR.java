package OCR.src.edu.mit.appinventor.ai.ocr;

import android.net.Uri;
import com.google.appinventor.components.annotations.*;
import com.google.appinventor.components.common.ComponentCategory;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;
import java.util.ArrayList;

import com.google.mlkit.vision.text.bundled.common.BundledTextRecognizerCreator;










@UsesLibraries(libraries = "textRecognition.jar, textRecognition.aar, textRecognitionCommon.aar, textRecognitionCommon.jar" +
        ", textRecognitionBundledLatin.aar, textRecognitionBundledLatin.jar, textRecognitionVisionCommon.aar, textRecognitionVisionCommon.jar")
//@UsesNativeLibraries(libraries = "play-services-mlkit-text-recognition-common.aar" + "com.google.mlkit.aar")
@DesignerComponent(version = 1,
        category = ComponentCategory.EXTENSION,
        description = "Extension that allows you to recognize text from images",
        nonVisible = true,
        androidMinSdk = 16,
        iconName = "")

@SimpleObject(external = true)
@UsesPermissions(permissionNames="android.permission.INTERNET")

public class OCR extends AndroidNonvisibleComponent {


    public OCR(ComponentContainer container) {
        super(container.$form());
    }
}

  /*  @SimpleFunction(description = "")
    public void setRecognizer(Uri ImageUri) {
        ArrayList<String> list = new ArrayList<>();
        /*recognizer = TextRecognition.getClient(TextRecognizerOptions.DEFAULT_OPTIONS);
        InputImage image = InputImage.fromFilePath(getApplicationContext(), imageUri);

        recognizer.process(image)
                .addOnSuccessListener(new OnSuccessListener<Text>() {
                    @Override
                    public void onSuccess(Text visionText) {
                        String resultText = result.getText();
                        list.add(resultText);
                    }
                 });

    }
    }
 */





