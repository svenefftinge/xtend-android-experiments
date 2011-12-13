package my.android

import android.content.Context
import android.widget.LinearLayout
import android.widget.TextView
import android.view.ViewGroup
import android.view.View
import android.widget.Button
import android.widget.Toast

class UiBuilder {
	
	def static linearLayout(Context context, (LinearLayout)=>void initializer) {
		val layout = new LinearLayout(context)
		initializer.apply(layout)
		return layout
	}
	
	def static textView(Context context, String text) {
		val result = new TextView(context)
		result.text = text
		return result
	}
	
	def static setView(ViewGroup group, View view) {
		group.addView(view)
	}
	
	def static button(Context context, String text, (Button)=>void initializer) {
		val result = new Button(context)
		result.text = text
		initializer.apply(result)
		return result
	}
	
	def static textMessage(Context context, String text) {
		Toast::makeText(context, text, Toast::LENGTH_SHORT)
	}
}