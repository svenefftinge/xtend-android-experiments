package my.android;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class UiBuilder {
  public static LinearLayout linearLayout(final Context context, final Procedure1<? super LinearLayout> initializer) {
      LinearLayout _linearLayout = new LinearLayout(context);
      final LinearLayout layout = _linearLayout;
      initializer.apply(layout);
      return layout;
  }
  
  public static TextView textView(final Context context, final String text) {
      TextView _textView = new TextView(context);
      final TextView result = _textView;
      result.setText(text);
      return result;
  }
  
  public static void setView(final ViewGroup group, final View view) {
    group.addView(view);
  }
  
  public static Button button(final Context context, final String text, final Procedure1<? super Button> initializer) {
      Button _button = new Button(context);
      final Button result = _button;
      result.setText(text);
      initializer.apply(result);
      return result;
  }
  
  public static Toast textMessage(final Context context, final String text) {
    Toast _makeText = Toast.makeText(context, text, Toast.LENGTH_SHORT);
    return _makeText;
  }
}
