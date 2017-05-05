package com.example.yangshaomin.text;

import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //声明
    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button_del;
    Button button_clean;
    Button button_except;
    Button button_ride;
    Button button_reduce;
    Button button_plus;
    Button button_equal;
    Button button_point;
    EditText et_input;
    //判断是否点击了"="按钮
    boolean isClickEqu = false;
    //用来传递参数
    float numA=0, numB = 0, numC = 0;
    //判断操作数
    int type = 0;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    // private GoogleApiClient client;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化控件
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button_point = (Button) findViewById(R.id.button_point);
        button_del = (Button) findViewById(R.id.button_del);
        button_clean = (Button) findViewById(R.id.button_clean);
        button_except = (Button) findViewById(R.id.button_except);
        button_ride = (Button) findViewById(R.id.button_ride);
        button_reduce = (Button) findViewById(R.id.button_reduce);
        button_plus = (Button) findViewById(R.id.button_plus);
        button_equal = (Button) findViewById(R.id.button_equal);
        et_input = (EditText) findViewById(R.id.et_input);
        button0.setOnClickListener((View.OnClickListener) this);
        button1.setOnClickListener((View.OnClickListener) this);
        button2.setOnClickListener((View.OnClickListener) this);
        button3.setOnClickListener((View.OnClickListener) this);
        button4.setOnClickListener((View.OnClickListener) this);
        button5.setOnClickListener((View.OnClickListener) this);
        button6.setOnClickListener((View.OnClickListener) this);
        button7.setOnClickListener((View.OnClickListener) this);
        button8.setOnClickListener((View.OnClickListener) this);
        button9.setOnClickListener((View.OnClickListener) this);
        button_del.setOnClickListener((View.OnClickListener) this);
        button_clean.setOnClickListener((View.OnClickListener) this);
        button_except.setOnClickListener((View.OnClickListener) this);
        button_ride.setOnClickListener((View.OnClickListener) this);
        button_reduce.setOnClickListener((View.OnClickListener) this);
        button_plus.setOnClickListener((View.OnClickListener) this);
        button_equal.setOnClickListener((View.OnClickListener) this);
        et_input.setOnClickListener((View.OnClickListener) this);
        button_point.setOnClickListener((View.OnClickListener) this);

    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {


            //返回上一个数值
            case R.id.button_del:
                //获取文本框输入信息
                String str = et_input.getText().toString();
                try {
                    et_input.setText(str.substring(0, str.length() - 1));

                } catch (Exception e) {
                    et_input.setText("");
                }
                break;

            //全清
            case R.id.button_clean:

                et_input.setText("");
                numA=0;
                numB=0;
                numC=0;

                break;

            //数字控件 buntton 0-9
            case R.id.button0:
                if (isClickEqu) {
                    et_input.setText(null);
                    isClickEqu = false;
                }

                String str1 = et_input.getText().toString();
                str1 += "0";
                et_input.setText(str1);
                break;

            case R.id.button1:
                if (isClickEqu) {
                    et_input.setText(null);
                    isClickEqu = false;
                }
                String str2 = et_input.getText().toString();
                str2 += "1";
                et_input.setText(str2);
                break;

            case R.id.button2:
                if (isClickEqu) {
                    et_input.setText(null);
                    isClickEqu = false;
                }
                String str3 = et_input.getText().toString();
                str3 += "2";
                et_input.setText(str3);
                break;
            case R.id.button3:
                if (isClickEqu) {
                    et_input.setText(null);
                    isClickEqu = false;
                }
                String str4 = et_input.getText().toString();
                str4 += "3";
                et_input.setText(str4);
                break;
            case R.id.button4:
                if (isClickEqu) {
                    et_input.setText(null);
                    isClickEqu = false;
                }
                String str5 = et_input.getText().toString();
                str5 += "4";
                et_input.setText(str5);
                break;
            case R.id.button5:
                if (isClickEqu) {
                    et_input.setText(null);
                    isClickEqu = false;
                }
                String str6 = et_input.getText().toString();
                str6 += "5";
                et_input.setText(str6);
                break;
            case R.id.button6:
                if (isClickEqu) {
                    et_input.setText(null);
                    isClickEqu = false;
                }
                String str7 = et_input.getText().toString();
                str7 += "6";
                et_input.setText(str7);
                break;
            case R.id.button7:
                if (isClickEqu) {
                    et_input.setText(null);
                    isClickEqu = false;
                }
                String str8 = et_input.getText().toString();
                str8 += "7";
                et_input.setText(str8);
                break;
            case R.id.button8:
                if (isClickEqu) {
                    et_input.setText(null);
                    isClickEqu = false;
                }
                String str9 = et_input.getText().toString();
                str9 += "8";
                et_input.setText(str9);
                break;
            case R.id.button9:
                if (isClickEqu) {
                    et_input.setText(null);
                    isClickEqu = false;
                }
                String str10 = et_input.getText().toString();
                str10 += "9";
                et_input.setText(str10);
                break;
            //运算符控件

            //小数点
            case R.id.button_point:

                if (isClickEqu) {
                    et_input.setText(null);
                    isClickEqu = false;
                }
                String str11 = et_input.getText().toString();
                str11 += ".";
                et_input.setText(str11);
                break;


            //加
            case R.id.button_plus:
                String strplus = et_input.getText().toString();
                //如果为空 直接return
                if (strplus.equals(null)) {
                    return;
                }
                //赋值number A
                numA = Float.valueOf(strplus);
                //清空输入框数值 等待接受number B
                et_input.setText(null);
                //定义方法序数
                type = 1;
                isClickEqu = false;
                break;

            //减
            case R.id.button_reduce:
                String strreduce = et_input.getText().toString();
                //如果为空 直接return
                if (strreduce.equals(null)) {
                    return;
                }
                //赋值number A
                numA=Float.valueOf(strreduce);
                //清空输入框数值 等待接受number B
                et_input.setText(null);
                //定义方法序数
                type = 2;
                isClickEqu = false;
                break;

            //乘
            case R.id.button_ride:
                String strride = et_input.getText().toString();
                //如果为空 直接return
                if (strride.equals(null)) {
                    return;
                }

                //赋值number A
                numA = Float.valueOf(strride);
                //清空输入框数值 等待接受number B
                et_input.setText(null);
                //定义方法序数
                type = 3;
                isClickEqu = false;
                break;


            //除
            case R.id.button_except:
                String strexcept = et_input.getText().toString();
                //如果为空 直接return
                if (strexcept.equals(null)) {
                    return;
                }

                //赋值number A
                numA = Float.valueOf(strexcept);
                //清空输入框数值 等待接受number B
                et_input.setText(null);
                //定义方法序数
                type = 4;
                isClickEqu = false;
                break;

            //等于（赋值number B）
            case R.id.button_equal:

                String strequal = et_input.getText().toString();

                if (strequal.equals(null)) {
                    return;

                }
                if(type==4&&strequal.equals("0")){
                    Toast.makeText(MainActivity.this,"被除数不能为零",Toast.LENGTH_SHORT).show();
                    et_input.setText("0");
                }



                numB = Float.valueOf(strequal);


                et_input.setText(null);

                switch (type) {


                    case 1:
                        numC = numA + numB;
                        break;
                    case 2:
                        numC = numA - numB;
                        break;
                    case 3:
                        numC = numA * numB;
                        break;
                    case 4:
                        numC = numA / numB;
                        break;
                    default:
                        numC = 0;
                        break;


                }
                et_input.setText(String.valueOf(numC));
                isClickEqu=true;
                break;

            default:
                break;


        }
    }
}
