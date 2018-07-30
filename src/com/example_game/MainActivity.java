package com.example_game;
 
import android.app.Activity;
import android.os.Bundle;  
import android.view.View;  
import android.widget.Button;  
import android.widget.ImageView;  
import android.widget.TextView;  
  
  
public class MainActivity extends Activity implements View.OnClickListener {  
    private TextView text;  
    private ImageView pic0;  
    private ImageView pic1;  
    private ImageView pic2;  
    int[] imageIds = new int[]{R.drawable.cup_ok, R.drawable.cup_sorry,  
            R.drawable.cup_sorry};  
  
    @Override  
    protected void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);  
        setContentView(R.layout.main);  
        pic0 = (ImageView) findViewById(R.id.pic0);  
        pic1 = (ImageView) findViewById(R.id.pic1);  
        pic2 = (ImageView) findViewById(R.id.pic2);  
        Button butplay = (Button) findViewById(R.id.butplay);  
        text = (TextView) findViewById(R.id.text);  
        pic0.setOnClickListener(this);  
        pic1.setOnClickListener(this);  
        pic2.setOnClickListener(this);  
        butplay.setOnClickListener(this);  
        replay();//�����Ƚ�����˳�����  
    }  
  
    @Override  
    public void onClick(View view) {  
        switch (view.getId()) {  
            case R.id.pic0:  
                //�����Ѵ���˳��ı���ͼƬ  
                pic0.setImageDrawable(getResources().getDrawable(imageIds[0]));  
                pic1.setImageDrawable(getResources().getDrawable(imageIds[1]));  
                pic2.setImageDrawable(getResources().getDrawable(imageIds[2]));  
                if (imageIds[0] == R.drawable.cup_ok) {  
                    //�ж��Ƿ������С��ı���  
                    text.setText("��ϲ�㣬�¶��ˣ�ף���Ҹ���");  
                } else  
                    text.setText("�ܱ�Ǹ���´��ˣ�Ҫ��Ҫ����һ�Σ�");  
                break;  
  
            case R.id.pic1:  
                pic0.setImageDrawable(getResources().getDrawable(imageIds[0]));  
                pic1.setImageDrawable(getResources().getDrawable( imageIds[1]));  
                pic2.setImageDrawable(getResources().getDrawable(imageIds[2]));  
                if (imageIds[1] == R.drawable.cup_ok) {  
                    text.setText("��ϲ�㣬�¶��ˣ�ף���Ҹ���");  
                } else  
                    text.setText("�ܱ�Ǹ���´��ˣ�Ҫ��Ҫ����һ�Σ�");  
                break;  
  
            case R.id.pic2:  
                pic0.setImageDrawable(getResources().getDrawable(imageIds[0]));  
                pic1.setImageDrawable(getResources().getDrawable(imageIds[1]));  
                pic2.setImageDrawable(getResources().getDrawable(imageIds[2]));  
                if (imageIds[2] == R.drawable.cup_ok) {  
                    text.setText("��ϲ�㣬�¶��ˣ�ף���Ҹ���");  
                } else  
                    text.setText("�ܱ�Ǹ���´��ˣ�Ҫ��Ҫ����һ�Σ�");  
                break;  
  
            case R.id.butplay:  
                replay();  
  
            default:  
                break;  
        }  
    }  
  
    public void replay() {  
        //�������һ�Σ��ָ�ԭ�б���ͱ���ͼƬ  
        text.setText(R.string.cup);  
        pic0.setImageDrawable(getResources().getDrawable(R.drawable.cup_default));  
        pic1.setImageDrawable(getResources().getDrawable( R.drawable.cup_default));  
        pic2.setImageDrawable(getResources().getDrawable(R.drawable.cup_default));  
  
        for (int i = 0; i < 3; i++) {  
            int temp = imageIds[i]; // ������Ԫ��i���浽��ʱ������  
            int index = (int) (Math.random() * 2); // ����һ�������  
            imageIds[i] = imageIds[index]; // �������ָ��������Ԫ�ص����ݸ�������Ԫ��i  
            imageIds[index] = temp; // ����ʱ������ֵ��ֵ���������ָ�����Ǹ�����Ԫ��  
        }  
    }  
}  