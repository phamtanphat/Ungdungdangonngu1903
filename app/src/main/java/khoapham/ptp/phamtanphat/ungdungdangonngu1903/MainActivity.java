package khoapham.ptp.phamtanphat.ungdungdangonngu1903;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TableRow;
import android.widget.Toast;

import java.util.regex.Pattern;

import khoapham.ptp.phamtanphat.ungdungdangonngu1903.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    User user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityMainBinding mainBinding = DataBindingUtil.setContentView(MainActivity.this,R.layout.activity_main);
        user = new User("Đăng nhập hệ thống","Nhập tài khoản" , "Nhập mật khẩu" , "Đăng nhập");
        mainBinding.setUser(user);
        mainBinding.executePendingBindings();

        mainBinding.buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = mainBinding.edittextUsername.getText().toString();
                String password = mainBinding.edittextPassword.getText().toString();
                if (!TextUtils.isEmpty(user) && password.length() > 0) {
                    String hienthiuser = getResources().getString(R.string.textTaikhoan);
                    String hienthimatkhau = getResources().getString(R.string.textMatkhau);
                    mainBinding.textviewInfo.setText(hienthiuser + " : " + user + "\n" + hienthimatkhau + " : " + password);
                    return;
                }
                Toast.makeText(MainActivity.this, "Bạn hãy nhập đủ thông tin", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
