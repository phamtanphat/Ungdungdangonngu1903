package khoapham.ptp.phamtanphat.ungdungdangonngu1903;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableRow;

import khoapham.ptp.phamtanphat.ungdungdangonngu1903.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    User user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding mainBinding = DataBindingUtil.setContentView(MainActivity.this,R.layout.activity_main);
        user = new User("Đăng nhập hệ thống","Nhập tài khoản" , "Nhập mật khẩu" , "Đăng nhập");



    }
}
