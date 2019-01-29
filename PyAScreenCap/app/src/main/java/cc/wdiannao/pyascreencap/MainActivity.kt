package cc.wdiannao.pyascreencap

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.cry.cry.mediaprojectioncode.RecordActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_2.setOnClickListener{
                _->
            var ip = "rtmp://192.168.100.4/live/STREAM_NAME"
            var w = "480"
            var h = "720"
            if (!edit_ip.text.toString().equals("")) {
                ip = edit_ip.text.toString()
            }
            if (!edit_w.text.toString().equals("")) {
                w = edit_w.text.toString()
            }
            if (!edit_h.text.toString().equals("")) {
                h = edit_h.text.toString()
            }
            val intent = Intent(this@MainActivity, RecordActivity::class.java)
            intent.putExtra("ip",ip)
            intent.putExtra("w", w)
            intent.putExtra("h", h)
            startActivity(intent)
        }
    }
}
