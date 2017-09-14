package edu.android.and57_git;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // 멤버 변수
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView = (TextView) findViewById(R.id.textView);

    }

    public void test() {
        // TODO : ??
    }



    public void testA() {

    }

    public void  testAA() {

    }

    public void testB() {

    }


    public void  testBB() {

    }
}
