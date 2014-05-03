package org.btc4all.btc2sms.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import org.btc4all.btc2sms.App;

public class Main extends Activity {   
	
    private App app;
    
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {   
        super.onCreate(savedInstanceState);
        
        app = (App)getApplication();
                
        startActivity(new Intent(this, LogView.class));
    }    
}