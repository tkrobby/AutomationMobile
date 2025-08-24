package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object ANDROID_APK
     
    /**
     * <p></p>
     */
    public static Object RANDOM_EMAIL_REGISTER
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
    
            ANDROID_APK = selectedVariables['ANDROID_APK']
            RANDOM_EMAIL_REGISTER = selectedVariables['RANDOM_EMAIL_REGISTER']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
