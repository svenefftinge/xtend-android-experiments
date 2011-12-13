package my.android;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import my.android.UiBuilder;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class AppActivity extends Activity {
  public void onCreate(final Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      final Procedure1<LinearLayout> _function = new Procedure1<LinearLayout>() {
          public void apply(final LinearLayout it) {
            {
              it.setOrientation(LinearLayout.VERTICAL);
              TextView _textView = UiBuilder.textView(AppActivity.this, "Hello Android!");
              UiBuilder.setView(it, _textView);
              final Procedure1<Button> _function = new Procedure1<Button>() {
                  public void apply(final Button it) {
                    final Procedure1<View> _function = new Procedure1<View>() {
                        public void apply(final View it) {
                          Toast _textMessage = UiBuilder.textMessage(AppActivity.this, "Hello you clicked me!");
                          _textMessage.show();
                        }
                      };
                    it.setOnClickListener(new OnClickListener() {
                        public void onClick(View arg0) {
                          _function.apply(arg0);
                        }
                    });
                  }
                };
              Button _button = UiBuilder.button(AppActivity.this, "Click Me!", _function);
              UiBuilder.setView(it, _button);
            }
          }
        };
      LinearLayout _linearLayout = UiBuilder.linearLayout(this, _function);
      this.setContentView(_linearLayout);
  }
}
