package my.android

import android.app.Activity
import android.os.Bundle

import static android.widget.LinearLayout.*
import static extension my.android.UiBuilder.*

class AppActivity extends Activity {
	
	override void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        contentView = this.linearLayout [
        	
        	orientation = VERTICAL
        	
        	view = this.textView ("Hello Android!")
        	
        	view = this.button ("Click Me!") [
        		onClickListener = [ 
        			this.textMessage('Hello you clicked me!').show
        		]
        	]
        ]
    }
    
}