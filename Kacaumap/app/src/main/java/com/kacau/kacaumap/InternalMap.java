package com.kacau.kacaumap;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.github.chrisbanes.photoview.PhotoView;


public class InternalMap {

    // for bld 101
    public static class InternalMap101 extends AppCompatActivity {
        PhotoView photoView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_internal_map_101);

            photoView = (PhotoView)findViewById(R.id.images101);
            photoView.setImageResource(R.drawable.b101_1);

            final Button cl1 = (Button)findViewById(R.id.b_1) ;
            final Button cl2 = (Button)findViewById(R.id.b_2) ;
            final Button cl3 = (Button)findViewById(R.id.b_3) ;

            // 1
            cl1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b101_1);
                    cl1.setTextColor(Color.BLUE);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                }
            });

            // 2
            cl2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b101_2);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLUE);
                    cl3.setTextColor(Color.BLACK);
                }
            });

            // 3
            cl3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b101_3);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLUE);
                }
            });


        }

    }

    // for bld 102
    public static class InternalMap102 extends AppCompatActivity {
        PhotoView photoView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_internal_map_102);

            photoView = (PhotoView)findViewById(R.id.images102);
            photoView.setImageResource(R.drawable.b102_1);

            final Button clb2 = (Button)findViewById(R.id.b_b2) ;
            final Button clb1 = (Button)findViewById(R.id.b_b1) ;
            final Button cl1 = (Button)findViewById(R.id.b_1) ;
            final Button cl2 = (Button)findViewById(R.id.b_2) ;
            final Button cl3 = (Button)findViewById(R.id.b_3) ;
            final Button cl4 = (Button)findViewById(R.id.b_4) ;
            final Button cl5 = (Button)findViewById(R.id.b_5) ;
            final Button cl6 = (Button)findViewById(R.id.b_6) ;
            final Button cl7 = (Button)findViewById(R.id.b_7) ;
            final Button cl8 = (Button)findViewById(R.id.b_8) ;
            final Button cl9 = (Button)findViewById(R.id.b_9) ;
            final Button cl10 = (Button)findViewById(R.id.b_10) ;
            final Button cl11 = (Button)findViewById(R.id.b_11) ;


            // b2
            clb2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b102_b2);
                    clb2.setTextColor(Color.BLUE);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLACK);
                    cl9.setTextColor(Color.BLACK);
                    cl10.setTextColor(Color.BLACK);
                    cl11.setTextColor(Color.BLACK);
                }
            });
            // b1
            clb1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b102_b1);
                    clb2.setTextColor(Color.BLACK);
                    clb1.setTextColor(Color.BLUE);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLACK);
                    cl9.setTextColor(Color.BLACK);
                    cl10.setTextColor(Color.BLACK);
                    cl11.setTextColor(Color.BLACK);
                }
            });

            // 1
            cl1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b102_1);
                    clb2.setTextColor(Color.BLACK);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLUE);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLACK);
                    cl9.setTextColor(Color.BLACK);
                    cl10.setTextColor(Color.BLACK);
                    cl11.setTextColor(Color.BLACK);
                }
            });

            // 2
            cl2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b102_2);
                    clb2.setTextColor(Color.BLACK);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLUE);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLACK);
                    cl9.setTextColor(Color.BLACK);
                    cl10.setTextColor(Color.BLACK);
                    cl11.setTextColor(Color.BLACK);
                }
            });

            // 3
            cl3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b102_3);
                    clb2.setTextColor(Color.BLACK);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLUE);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLACK);
                    cl9.setTextColor(Color.BLACK);
                    cl10.setTextColor(Color.BLACK);
                    cl11.setTextColor(Color.BLACK);
                }
            });

            // 4
            cl4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b102_4);
                    clb2.setTextColor(Color.BLACK);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLUE);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLACK);
                    cl9.setTextColor(Color.BLACK);
                    cl10.setTextColor(Color.BLACK);
                    cl11.setTextColor(Color.BLACK);
                }
            });

            // 5
            cl5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b102_5);
                    clb2.setTextColor(Color.BLACK);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLUE);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLACK);
                    cl9.setTextColor(Color.BLACK);
                    cl10.setTextColor(Color.BLACK);
                    cl11.setTextColor(Color.BLACK);
                }
            });

            // 6
            cl6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b102_6);
                    clb2.setTextColor(Color.BLACK);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLUE);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLACK);
                    cl9.setTextColor(Color.BLACK);
                    cl10.setTextColor(Color.BLACK);
                    cl11.setTextColor(Color.BLACK);
                }

            });

            // 7
            cl7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b102_7);
                    clb2.setTextColor(Color.BLACK);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLUE);
                    cl8.setTextColor(Color.BLACK);
                    cl9.setTextColor(Color.BLACK);
                    cl10.setTextColor(Color.BLACK);
                    cl11.setTextColor(Color.BLACK);
                }

            });
            // 8
            cl8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b102_8);
                    clb2.setTextColor(Color.BLACK);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLUE);
                    cl9.setTextColor(Color.BLACK);
                    cl10.setTextColor(Color.BLACK);
                    cl11.setTextColor(Color.BLACK);
                }

            });
            // 9
            cl9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b102_9);
                    clb2.setTextColor(Color.BLACK);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLACK);
                    cl9.setTextColor(Color.BLUE);
                    cl10.setTextColor(Color.BLACK);
                    cl11.setTextColor(Color.BLACK);
                }

            });
            // 10
            cl10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b102_10);
                    clb2.setTextColor(Color.BLACK);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLACK);
                    cl9.setTextColor(Color.BLACK);
                    cl10.setTextColor(Color.BLUE);
                    cl11.setTextColor(Color.BLACK);
                }

            });
            // 11
            cl11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b102_11);
                    clb2.setTextColor(Color.BLACK);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLACK);
                    cl9.setTextColor(Color.BLACK);
                    cl10.setTextColor(Color.BLACK);
                    cl11.setTextColor(Color.BLUE);
                }

            });
        }

    }

    // for bld 103
    public static class InternalMap103 extends AppCompatActivity {
        PhotoView photoView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_internal_map_103);

            photoView = (PhotoView)findViewById(R.id.images103);
            photoView.setImageResource(R.drawable.b103_1);

            final Button cl1 = (Button)findViewById(R.id.b_1) ;
            final Button cl2 = (Button)findViewById(R.id.b_2) ;
            final Button cl3 = (Button)findViewById(R.id.b_3) ;
            final Button cl4 = (Button)findViewById(R.id.b_4) ;

            // 1
            cl1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b103_1);
                    cl1.setTextColor(Color.BLUE);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);

                }
            });

            // 2
            cl2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b103_2);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLUE);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);

                }
            });

            // 3
            cl3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b103_3);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLUE);
                    cl4.setTextColor(Color.BLACK);
                }
            });

            // 4
            cl4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b103_4);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLUE);
                }
            });

        }

    }

    // for bld 104
    public static class InternalMap104 extends AppCompatActivity {
        PhotoView photoView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_internal_map_104);

            photoView = (PhotoView)findViewById(R.id.images104);
            photoView.setImageResource(R.drawable.b104_1);

            final Button cl1 = (Button)findViewById(R.id.b_1) ;
            final Button cl2 = (Button)findViewById(R.id.b_2) ;
            final Button cl3 = (Button)findViewById(R.id.b_3) ;
            final Button cl4 = (Button)findViewById(R.id.b_4) ;
            final Button cl5 = (Button)findViewById(R.id.b_5) ;
            final Button cl6 = (Button)findViewById(R.id.b_6) ;
            final Button cl7 = (Button)findViewById(R.id.b_7) ;


            // 1
            cl1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b104_1);
                    cl1.setTextColor(Color.BLUE);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                }
            });

            // 2
            cl2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b104_2);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLUE);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                }
            });

            // 3
            cl3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b104_3);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLUE);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                }
            });

            // 4
            cl4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b104_4);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLUE);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                }
            });

            // 5
            cl5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b104_5);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLUE);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                }
            });

            // 6
            cl6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b104_6);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLUE);
                    cl7.setTextColor(Color.BLACK);
                }

            });

            // 7
            cl7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b104_7);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLUE);
                }

            });
        }

    }

    // for bld 105
    public static class InternalMap105 extends AppCompatActivity {
        PhotoView photoView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_internal_map_105);

            photoView = (PhotoView)findViewById(R.id.images105);
            photoView.setImageResource(R.drawable.b105_1);

            final Button clb2 = (Button)findViewById(R.id.b_b2) ;
            final Button clb1 = (Button)findViewById(R.id.b_b1) ;
            final Button cl1 = (Button)findViewById(R.id.b_1) ;
            final Button cl2 = (Button)findViewById(R.id.b_2) ;
            final Button cl3 = (Button)findViewById(R.id.b_3) ;
            final Button cl4 = (Button)findViewById(R.id.b_4) ;
            final Button cl5 = (Button)findViewById(R.id.b_5) ;
            final Button cl6 = (Button)findViewById(R.id.b_6) ;


            // b2
            clb2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b105_b2);
                    clb2.setTextColor(Color.BLUE);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);

                }
            });
            // b1
            clb1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b105_b1);
                    clb2.setTextColor(Color.BLACK);
                    clb1.setTextColor(Color.BLUE);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                }
            });

            // 1
            cl1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b105_1);
                    clb2.setTextColor(Color.BLACK);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLUE);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                }
            });

            // 2
            cl2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b105_2);
                    clb2.setTextColor(Color.BLACK);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLUE);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                }
            });

            // 3
            cl3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b105_3);
                    clb2.setTextColor(Color.BLACK);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLUE);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                }
            });

            // 4
            cl4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b105_4);
                    clb2.setTextColor(Color.BLACK);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLUE);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                }
            });

            // 5
            cl5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b105_5);
                    clb2.setTextColor(Color.BLACK);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLUE);
                    cl6.setTextColor(Color.BLACK);
                }
            });

            // 6
            cl6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b105_6);
                    clb2.setTextColor(Color.BLACK);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLUE);
                }

            });
        }

    }

    // for bld 106
    public static class InternalMap106 extends AppCompatActivity {
        PhotoView photoView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_internal_map_106);

            photoView = (PhotoView)findViewById(R.id.images106);
            photoView.setImageResource(R.drawable.b106_1);

            final Button clb1 = (Button)findViewById(R.id.b_b1) ;
            final Button cl1 = (Button)findViewById(R.id.b_1) ;
            final Button cl2 = (Button)findViewById(R.id.b_2) ;
            final Button cl3 = (Button)findViewById(R.id.b_3) ;
            final Button cl4 = (Button)findViewById(R.id.b_4) ;
            final Button cl5 = (Button)findViewById(R.id.b_5) ;

            // b1
            clb1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b106_b1);
                    clb1.setTextColor(Color.BLUE);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);

                }
            });

            // 1
            cl1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b106_1);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLUE);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);

                }
            });

            // 2
            cl2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b106_2);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLUE);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);

                }
            });

            // 3
            cl3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b106_3);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLUE);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);

                }
            });

            // 4
            cl4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b106_4);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLUE);
                    cl5.setTextColor(Color.BLACK);

                }
            });

            // 5
            cl5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b106_5);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLUE);

                }
            });
        }
    }

    // for bld 107
    public static class InternalMap107 extends AppCompatActivity {
        PhotoView photoView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_internal_map_107);

            photoView = (PhotoView)findViewById(R.id.images107);
            photoView.setImageResource(R.drawable.b107_1);

            final Button cl1 = (Button)findViewById(R.id.b_1) ;
            final Button cl2 = (Button)findViewById(R.id.b_2) ;
            final Button cl3 = (Button)findViewById(R.id.b_3) ;
            final Button cl4 = (Button)findViewById(R.id.b_4) ;
            final Button cl5 = (Button)findViewById(R.id.b_5) ;
            final Button cl6 = (Button)findViewById(R.id.b_6) ;

            // 1
            cl1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b107_1);
                    cl1.setTextColor(Color.BLUE);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                }
            });

            // 2
            cl2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b107_2);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLUE);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                }
            });

            // 3
            cl3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b107_3);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLUE);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                }
            });

            // 4
            cl4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b107_4);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLUE);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                }
            });

            // 5
            cl5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b107_5);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLUE);
                    cl6.setTextColor(Color.BLACK);
                }
            });

            // 6
            cl6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b107_6);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLUE);
                }

            });

        }

    }

    // for bld 201
    public static class InternalMap201 extends AppCompatActivity {
        PhotoView photoView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_internal_map_201);

            photoView = (PhotoView)findViewById(R.id.images201);
            photoView.setImageResource(R.drawable.b201_1);

            final Button cl1 = (Button)findViewById(R.id.b_1) ;
            final Button cl2 = (Button)findViewById(R.id.b_2) ;
            final Button cl3 = (Button)findViewById(R.id.b_3) ;

            // 1
            cl1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b201_1);
                    cl1.setTextColor(Color.BLUE);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                }
            });

            // 2
            cl2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b201_2);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLUE);
                    cl3.setTextColor(Color.BLACK);
                }
            });

            // 3
            cl3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b201_3);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLUE);
                }
            });

        }

    }

    // for bld 202
    public static class InternalMap202 extends AppCompatActivity {
        PhotoView photoView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_internal_map_202);

            photoView = (PhotoView)findViewById(R.id.images202);
            photoView.setImageResource(R.drawable.b202_1);

            final Button clb1 = (Button)findViewById(R.id.b_b1) ;
            final Button cl1 = (Button)findViewById(R.id.b_1) ;
            final Button cl2 = (Button)findViewById(R.id.b_2) ;
            final Button cl3 = (Button)findViewById(R.id.b_3) ;
            final Button cl4 = (Button)findViewById(R.id.b_4) ;
            final Button cl5 = (Button)findViewById(R.id.b_5) ;

            // b1
            clb1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b202_b1);
                    clb1.setTextColor(Color.BLUE);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                }
            });

            // 1
            cl1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b202_1);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLUE);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                }
            });

            // 2
            cl2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b202_2);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLUE);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                }
            });

            // 3
            cl3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b202_3);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLUE);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                }
            });

            // 4
            cl4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b202_4);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLUE);
                    cl5.setTextColor(Color.BLACK);
                }
            });

            // 5
            cl5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b202_5);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLUE);
                }
            });
        }

    }

    // for bld 203
    public static class InternalMap203 extends AppCompatActivity {
        PhotoView photoView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_internal_map_203);

            photoView = (PhotoView)findViewById(R.id.images203);
            photoView.setImageResource(R.drawable.b203_1);

            final Button cl1 = (Button)findViewById(R.id.b_1) ;
            final Button cl2 = (Button)findViewById(R.id.b_2) ;
            final Button cl3 = (Button)findViewById(R.id.b_3) ;
            final Button cl4 = (Button)findViewById(R.id.b_4) ;
            final Button cl5 = (Button)findViewById(R.id.b_5) ;
            final Button cl6 = (Button)findViewById(R.id.b_6) ;
            final Button cl7 = (Button)findViewById(R.id.b_7) ;
            final Button cl8 = (Button)findViewById(R.id.b_8) ;

            // 1
            cl1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b203_1);
                    cl1.setTextColor(Color.BLUE);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLACK);
                }
            });

            // 2
            cl2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b203_2);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLUE);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLACK);
                }
            });

            // 3
            cl3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b203_3);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLUE);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLACK);
                }
            });

            // 4
            cl4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b203_4);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLUE);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLACK);
                }
            });

            // 5
            cl5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b203_5);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLUE);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLACK);
                }
            });
            // 6
            cl6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b203_6);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLUE);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLACK);
                }
            });
            // 7
            cl7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b203_7);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLUE);
                    cl8.setTextColor(Color.BLACK);
                }
            });
            // 8
            cl8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b203_8);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLUE);
                }
            });
        }

    }

    // for bld 204
    public static class InternalMap204 extends AppCompatActivity {
        PhotoView photoView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_internal_map_204);

            photoView = (PhotoView)findViewById(R.id.images204);
            photoView.setImageResource(R.drawable.b204_1);

            final Button clb1 = (Button)findViewById(R.id.cl_b1) ;
            final Button cl1 = (Button)findViewById(R.id.cl_1) ;
            final Button cl2 = (Button)findViewById(R.id.cl_2) ;
            final Button cl3 = (Button)findViewById(R.id.cl_3) ;
            final Button cl4 = (Button)findViewById(R.id.cl_4) ;
            final Button cl5 = (Button)findViewById(R.id.cl_5) ;
            final Button cl6 = (Button)findViewById(R.id.cl_6) ;
            final Button cl7 = (Button)findViewById(R.id.cl_7) ;

            // b1
            clb1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b204_b1);
                    clb1.setTextColor(Color.BLUE);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                }
            });

            // 1
            cl1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b204_1);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLUE);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                }
            });

            // 2
            cl2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b204_2);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLUE);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                }
            });

            // 3
            cl3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b204_3);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLUE);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                }
            });

            // 4
            cl4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b204_4);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLUE);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                }
            });

            // 5
            cl5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b204_5);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLUE);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                }
            });

            // 6
            cl6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b204_6);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLUE);
                    cl7.setTextColor(Color.BLACK);
                }

            });

            // 7
            cl7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b204_7);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLUE);
                }

            });


        }

    }

    // for bld 207
    public static class InternalMap207 extends AppCompatActivity {
        PhotoView photoView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_internal_map_207);

            photoView = (PhotoView)findViewById(R.id.images207);
            photoView.setImageResource(R.drawable.b207_1);

            final Button clb1 = (Button)findViewById(R.id.b_b1) ;
            final Button cl1 = (Button)findViewById(R.id.b_1) ;
            final Button cl2 = (Button)findViewById(R.id.b_2) ;
            final Button cl3 = (Button)findViewById(R.id.b_3) ;
            final Button cl4 = (Button)findViewById(R.id.b_4) ;
            final Button cl5 = (Button)findViewById(R.id.b_5) ;
            final Button cl6 = (Button)findViewById(R.id.b_6) ;
            final Button cl7 = (Button)findViewById(R.id.b_7) ;

            // b1
            clb1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b207_b1);
                    clb1.setTextColor(Color.BLUE);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                }
            });

            // 1
            cl1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b207_1);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLUE);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                }
            });

            // 2
            cl2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b207_2);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLUE);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                }
            });

            // 3
            cl3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b207_3);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLUE);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                }
            });

            // 4
            cl4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b207_4);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLUE);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                }
            });

            // 5
            cl5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b207_5);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLUE);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                }
            });
            // 6
            cl6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b207_6);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLUE);
                    cl7.setTextColor(Color.BLACK);
                }
            });
            // 7
            cl7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b207_7);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLUE);
                }
            });

        }

    }

    // for bld 208
    public static class InternalMap208 extends AppCompatActivity{
        PhotoView photoView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_internal_map_208);

            photoView = (PhotoView)findViewById(R.id.images208);
            photoView.setImageResource(R.drawable.b208_1);

            final Button seb1 = (Button)findViewById(R.id.se_b1) ;
            final Button se1 = (Button)findViewById(R.id.se_1) ;
            final Button se2 = (Button)findViewById(R.id.se_2) ;
            final Button se3 = (Button)findViewById(R.id.se_3) ;
            final Button se4 = (Button)findViewById(R.id.se_4) ;
            final Button se5 = (Button)findViewById(R.id.se_5) ;
            final Button se6 = (Button)findViewById(R.id.se_6) ;

            // b1
            seb1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b208_b1);
                    seb1.setTextColor(Color.BLUE);
                    se1.setTextColor(Color.BLACK);
                    se2.setTextColor(Color.BLACK);
                    se3.setTextColor(Color.BLACK);
                    se4.setTextColor(Color.BLACK);
                    se5.setTextColor(Color.BLACK);
                    se6.setTextColor(Color.BLACK);
                }
            });

            // 1
            se1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b208_1);
                    se1.setTextColor(Color.BLUE);
                    seb1.setTextColor(Color.BLACK);
                    se2.setTextColor(Color.BLACK);
                    se3.setTextColor(Color.BLACK);
                    se4.setTextColor(Color.BLACK);
                    se5.setTextColor(Color.BLACK);
                    se6.setTextColor(Color.BLACK);
                }
            });

            // 2
            se2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b208_2);
                    se2.setTextColor(Color.BLUE);
                    seb1.setTextColor(Color.BLACK);
                    se1.setTextColor(Color.BLACK);
                    se3.setTextColor(Color.BLACK);
                    se4.setTextColor(Color.BLACK);
                    se5.setTextColor(Color.BLACK);
                    se6.setTextColor(Color.BLACK);
                }
            });

            // 3
            se3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b208_3);
                    se3.setTextColor(Color.BLUE);
                    seb1.setTextColor(Color.BLACK);
                    se1.setTextColor(Color.BLACK);
                    se2.setTextColor(Color.BLACK);
                    se4.setTextColor(Color.BLACK);
                    se5.setTextColor(Color.BLACK);
                    se6.setTextColor(Color.BLACK);
                }
            });

            // 4
            se4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b208_4);
                    se4.setTextColor(Color.BLUE);
                    seb1.setTextColor(Color.BLACK);
                    se1.setTextColor(Color.BLACK);
                    se2.setTextColor(Color.BLACK);
                    se3.setTextColor(Color.BLACK);
                    se5.setTextColor(Color.BLACK);
                    se6.setTextColor(Color.BLACK);
                }
            });

            // 5
            se5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b208_5);
                    se5.setTextColor(Color.BLUE);
                    seb1.setTextColor(Color.BLACK);
                    se1.setTextColor(Color.BLACK);
                    se2.setTextColor(Color.BLACK);
                    se3.setTextColor(Color.BLACK);
                    se4.setTextColor(Color.BLACK);
                    se6.setTextColor(Color.BLACK);
                }
            });

            // 6
            se6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b208_6);
                    se6.setTextColor(Color.BLUE);
                    seb1.setTextColor(Color.BLACK);
                    se1.setTextColor(Color.BLACK);
                    se2.setTextColor(Color.BLACK);
                    se3.setTextColor(Color.BLACK);
                    se4.setTextColor(Color.BLACK);
                    se5.setTextColor(Color.BLACK);
                }
            });


        }

    }

    // for bld 209
    public static class InternalMap209 extends AppCompatActivity {
        PhotoView photoView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_internal_map_209);

            photoView = (PhotoView)findViewById(R.id.images209);
            photoView.setImageResource(R.drawable.b209_1);

            final Button clb2 = (Button)findViewById(R.id.b_b2) ;
            final Button clb1 = (Button)findViewById(R.id.b_b1) ;
            final Button cl1 = (Button)findViewById(R.id.b_1) ;
            final Button cl2 = (Button)findViewById(R.id.b_2) ;
            final Button cl3 = (Button)findViewById(R.id.b_3) ;
            final Button cl4 = (Button)findViewById(R.id.b_4) ;
            final Button cl5 = (Button)findViewById(R.id.b_5) ;
            final Button cl6 = (Button)findViewById(R.id.b_6) ;
            final Button cl7 = (Button)findViewById(R.id.b_7) ;
            final Button cl8 = (Button)findViewById(R.id.b_8) ;

            // b2
            clb2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b209_b2);
                    clb2.setTextColor(Color.BLUE);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLACK);
                }
            });

            // b1
            clb1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b209_b1);
                    clb2.setTextColor(Color.BLACK);
                    clb1.setTextColor(Color.BLUE);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLACK);
                }
            });

            // 1
            cl1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b209_1);
                    clb2.setTextColor(Color.BLACK);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLUE);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLACK);
                }
            });

            // 2
            cl2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b209_2);
                    clb2.setTextColor(Color.BLACK);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLUE);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLACK);
                }
            });

            // 3
            cl3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b209_3);
                    clb2.setTextColor(Color.BLACK);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLUE);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLACK);
                }
            });

            // 4
            cl4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b209_4);
                    clb2.setTextColor(Color.BLACK);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLUE);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLACK);
                }
            });

            // 5
            cl5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b209_5);
                    clb2.setTextColor(Color.BLACK);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLUE);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLACK);
                }
            });
            // 6
            cl6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b209_6);
                    clb2.setTextColor(Color.BLACK);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLUE);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLACK);
                }
            });
            // 7
            cl7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b209_7);
                    clb2.setTextColor(Color.BLACK);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLUE);
                    cl8.setTextColor(Color.BLACK);
                }
            });
            // 8
            cl8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b209_8);
                    clb2.setTextColor(Color.BLACK);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLUE);
                }
            });

        }

    }

    // for bld 301
    public static class InternalMap301 extends AppCompatActivity {
        PhotoView photoView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_internal_map_301);

            photoView = (PhotoView)findViewById(R.id.images301);
            photoView.setImageResource(R.drawable.b301_1);

            final Button clb2 = (Button)findViewById(R.id.b_b2) ;
            final Button clb1 = (Button)findViewById(R.id.b_b1) ;
            final Button cl1 = (Button)findViewById(R.id.b_1) ;
            final Button cl2 = (Button)findViewById(R.id.b_2) ;
            final Button cl3 = (Button)findViewById(R.id.b_3) ;
            final Button cl4 = (Button)findViewById(R.id.b_4) ;
            final Button cl5 = (Button)findViewById(R.id.b_5) ;
            final Button cl6 = (Button)findViewById(R.id.b_6) ;
            final Button cl7 = (Button)findViewById(R.id.b_7) ;
            final Button cl8 = (Button)findViewById(R.id.b_8) ;
            final Button cl9 = (Button)findViewById(R.id.b_9) ;

            // b2
            clb2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b301_b2);
                    clb2.setTextColor(Color.BLUE);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLACK);
                    cl9.setTextColor(Color.BLACK);
                }
            });
            // b1
            clb1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b301_b1);
                    clb2.setTextColor(Color.BLACK);
                    clb1.setTextColor(Color.BLUE);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLACK);
                    cl9.setTextColor(Color.BLACK);
                }
            });

            // 1
            cl1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b301_1);
                    clb2.setTextColor(Color.BLACK);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLUE);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLACK);
                    cl9.setTextColor(Color.BLACK);
                }
            });

            // 2
            cl2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b301_2);
                    clb2.setTextColor(Color.BLACK);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLUE);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLACK);
                    cl9.setTextColor(Color.BLACK);
                }
            });

            // 3
            cl3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b301_3);
                    clb2.setTextColor(Color.BLACK);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLUE);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLACK);
                    cl9.setTextColor(Color.BLACK);
                }
            });

            // 4
            cl4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b301_4);
                    clb2.setTextColor(Color.BLACK);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLUE);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLACK);
                    cl9.setTextColor(Color.BLACK);
                }
            });

            // 5
            cl5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b301_5);
                    clb2.setTextColor(Color.BLACK);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLUE);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLACK);
                    cl9.setTextColor(Color.BLACK);
                }
            });

            // 6
            cl6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b301_6);
                    clb2.setTextColor(Color.BLACK);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLUE);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLACK);
                    cl9.setTextColor(Color.BLACK);
                }

            });

            // 7
            cl7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b301_7);
                    clb2.setTextColor(Color.BLACK);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLUE);
                    cl8.setTextColor(Color.BLACK);
                    cl9.setTextColor(Color.BLACK);
                }

            });
            // 8
            cl8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b301_8);
                    clb2.setTextColor(Color.BLACK);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLUE);
                    cl9.setTextColor(Color.BLACK);
                }

            });
            // 9
            cl9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b301_9);
                    clb2.setTextColor(Color.BLACK);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLACK);
                    cl9.setTextColor(Color.BLUE);
                }

            });
        }

    }

    // for bld 302
    public static class InternalMap302 extends AppCompatActivity {
        PhotoView photoView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_internal_map_302);

            photoView = (PhotoView)findViewById(R.id.images302);
            photoView.setImageResource(R.drawable.b302_1);

            final Button clb3 = (Button)findViewById(R.id.b_b3) ;
            final Button clb2 = (Button)findViewById(R.id.b_b2) ;
            final Button clb1 = (Button)findViewById(R.id.b_b1) ;
            final Button cl1 = (Button)findViewById(R.id.b_1) ;
            final Button cl2 = (Button)findViewById(R.id.b_2) ;
            final Button cl3 = (Button)findViewById(R.id.b_3) ;
            final Button cl4 = (Button)findViewById(R.id.b_4) ;
            final Button cl5 = (Button)findViewById(R.id.b_5) ;


            // b3
            clb3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b302_b3);
                    clb3.setTextColor(Color.BLUE);
                    clb2.setTextColor(Color.BLACK);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                }
            });
            // b2
            clb2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b302_b2);
                    clb3.setTextColor(Color.BLACK);
                    clb2.setTextColor(Color.BLUE);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                }
            });
            // b1
            clb1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b302_b1);
                    clb3.setTextColor(Color.BLACK);
                    clb2.setTextColor(Color.BLACK);
                    clb1.setTextColor(Color.BLUE);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                }
            });

            // 1
            cl1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b302_1);
                    clb3.setTextColor(Color.BLACK);
                    clb2.setTextColor(Color.BLACK);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLUE);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                }
            });

            // 2
            cl2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b302_2);
                    clb3.setTextColor(Color.BLACK);
                    clb2.setTextColor(Color.BLACK);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLUE);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                }
            });

            // 3
            cl3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b302_3);
                    clb3.setTextColor(Color.BLACK);
                    clb2.setTextColor(Color.BLACK);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLUE);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                }
            });

            // 4
            cl4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b302_4);
                    clb3.setTextColor(Color.BLACK);
                    clb2.setTextColor(Color.BLACK);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLUE);
                    cl5.setTextColor(Color.BLACK);
                }
            });

            // 5
            cl5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b302_5);
                    clb3.setTextColor(Color.BLACK);
                    clb2.setTextColor(Color.BLACK);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLUE);
                }
            });

        }

    }

    // for bld 303
    public static class InternalMap303 extends AppCompatActivity {
        PhotoView photoView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_internal_map_303);

            photoView = (PhotoView)findViewById(R.id.images303);
            photoView.setImageResource(R.drawable.b303_1);

            final Button clb1 = (Button)findViewById(R.id.b_b1) ;
            final Button cl1 = (Button)findViewById(R.id.b_1) ;
            final Button cl2 = (Button)findViewById(R.id.b_2) ;
            final Button cl3 = (Button)findViewById(R.id.b_3) ;
            final Button cl4 = (Button)findViewById(R.id.b_4) ;
            final Button cl5 = (Button)findViewById(R.id.b_5) ;
            final Button cl6 = (Button)findViewById(R.id.b_6) ;
            final Button cl7 = (Button)findViewById(R.id.b_7) ;
            final Button cl8 = (Button)findViewById(R.id.b_8) ;
            final Button cl9 = (Button)findViewById(R.id.b_9) ;
            final Button cl10 = (Button)findViewById(R.id.b_10) ;
            final Button cl11 = (Button)findViewById(R.id.b_11) ;
            final Button cl12 = (Button)findViewById(R.id.b_12) ;
            final Button cl13 = (Button)findViewById(R.id.b_13) ;
            final Button cl14 = (Button)findViewById(R.id.b_14) ;


            // b1
            clb1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b303_b1);
                    clb1.setTextColor(Color.BLUE);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLACK);
                    cl9.setTextColor(Color.BLACK);
                    cl10.setTextColor(Color.BLACK);
                    cl11.setTextColor(Color.BLACK);
                    cl12.setTextColor(Color.BLACK);
                    cl13.setTextColor(Color.BLACK);
                    cl14.setTextColor(Color.BLACK);
                }
            });

            // 1
            cl1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b303_1);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLUE);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLACK);
                    cl9.setTextColor(Color.BLACK);
                    cl10.setTextColor(Color.BLACK);
                    cl11.setTextColor(Color.BLACK);
                    cl12.setTextColor(Color.BLACK);
                    cl13.setTextColor(Color.BLACK);
                    cl14.setTextColor(Color.BLACK);
                }
            });

            // 2
            cl2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b303_2);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLUE);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLACK);
                    cl9.setTextColor(Color.BLACK);
                    cl10.setTextColor(Color.BLACK);
                    cl11.setTextColor(Color.BLACK);
                    cl12.setTextColor(Color.BLACK);
                    cl13.setTextColor(Color.BLACK);
                    cl14.setTextColor(Color.BLACK);
                }
            });

            // 3
            cl3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b303_3);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLUE);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLACK);
                    cl9.setTextColor(Color.BLACK);
                    cl10.setTextColor(Color.BLACK);
                    cl11.setTextColor(Color.BLACK);
                    cl12.setTextColor(Color.BLACK);
                    cl13.setTextColor(Color.BLACK);
                    cl14.setTextColor(Color.BLACK);
                }
            });

            // 4
            cl4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b303_4);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLUE);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLACK);
                    cl9.setTextColor(Color.BLACK);
                    cl10.setTextColor(Color.BLACK);
                    cl11.setTextColor(Color.BLACK);
                    cl12.setTextColor(Color.BLACK);
                    cl13.setTextColor(Color.BLACK);
                    cl14.setTextColor(Color.BLACK);
                }
            });

            // 5
            cl5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b303_5);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLUE);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLACK);
                    cl9.setTextColor(Color.BLACK);
                    cl10.setTextColor(Color.BLACK);
                    cl11.setTextColor(Color.BLACK);
                    cl12.setTextColor(Color.BLACK);
                    cl13.setTextColor(Color.BLACK);
                    cl14.setTextColor(Color.BLACK);
                }
            });

            // 6
            cl6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b303_6);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLUE);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLACK);
                    cl9.setTextColor(Color.BLACK);
                    cl10.setTextColor(Color.BLACK);
                    cl11.setTextColor(Color.BLACK);
                    cl12.setTextColor(Color.BLACK);
                    cl13.setTextColor(Color.BLACK);
                    cl14.setTextColor(Color.BLACK);
                }

            });

            // 7
            cl7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b303_7);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLUE);
                    cl8.setTextColor(Color.BLACK);
                    cl9.setTextColor(Color.BLACK);
                    cl10.setTextColor(Color.BLACK);
                    cl11.setTextColor(Color.BLACK);
                    cl12.setTextColor(Color.BLACK);
                    cl13.setTextColor(Color.BLACK);
                    cl14.setTextColor(Color.BLACK);
                }

            });
            // 8
            cl8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b303_8);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLUE);
                    cl9.setTextColor(Color.BLACK);
                    cl10.setTextColor(Color.BLACK);
                    cl11.setTextColor(Color.BLACK);
                    cl12.setTextColor(Color.BLACK);
                    cl13.setTextColor(Color.BLACK);
                    cl14.setTextColor(Color.BLACK);
                }

            });
            // 9
            cl9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b303_9);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLACK);
                    cl9.setTextColor(Color.BLUE);
                    cl10.setTextColor(Color.BLACK);
                    cl11.setTextColor(Color.BLACK);
                    cl12.setTextColor(Color.BLACK);
                    cl13.setTextColor(Color.BLACK);
                    cl14.setTextColor(Color.BLACK);
                }

            });
            // 10
            cl10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b303_10);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLACK);
                    cl9.setTextColor(Color.BLACK);
                    cl10.setTextColor(Color.BLUE);
                    cl11.setTextColor(Color.BLACK);
                    cl12.setTextColor(Color.BLACK);
                    cl13.setTextColor(Color.BLACK);
                    cl14.setTextColor(Color.BLACK);
                }

            });
            // 11
            cl11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b303_11);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLACK);
                    cl9.setTextColor(Color.BLACK);
                    cl10.setTextColor(Color.BLACK);
                    cl11.setTextColor(Color.BLUE);
                    cl12.setTextColor(Color.BLACK);
                    cl13.setTextColor(Color.BLACK);
                    cl14.setTextColor(Color.BLACK);
                }

            });
            // 12
            cl12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b303_12);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLACK);
                    cl9.setTextColor(Color.BLACK);
                    cl10.setTextColor(Color.BLACK);
                    cl11.setTextColor(Color.BLACK);
                    cl12.setTextColor(Color.BLUE);
                    cl13.setTextColor(Color.BLACK);
                    cl14.setTextColor(Color.BLACK);
                }

            });
            // 13
            cl13.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b303_13);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLACK);
                    cl9.setTextColor(Color.BLACK);
                    cl10.setTextColor(Color.BLACK);
                    cl11.setTextColor(Color.BLACK);
                    cl12.setTextColor(Color.BLACK);
                    cl13.setTextColor(Color.BLUE);
                    cl14.setTextColor(Color.BLACK);
                }

            });
            // 14
            cl14.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b303_14);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLACK);
                    cl9.setTextColor(Color.BLACK);
                    cl10.setTextColor(Color.BLACK);
                    cl11.setTextColor(Color.BLACK);
                    cl12.setTextColor(Color.BLACK);
                    cl13.setTextColor(Color.BLACK);
                    cl14.setTextColor(Color.BLUE);
                }

            });
        }

    }

    // for bld 304
    public static class InternalMap304 extends AppCompatActivity {
        PhotoView photoView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_internal_map_304);

            photoView = (PhotoView)findViewById(R.id.images304);
            photoView.setImageResource(R.drawable.b304_1);

            final Button clb1 = (Button)findViewById(R.id.b_b1) ;
            final Button cl1 = (Button)findViewById(R.id.b_1) ;
            final Button cl2 = (Button)findViewById(R.id.b_2) ;

            // b1
            clb1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b304_b1);
                    clb1.setTextColor(Color.BLUE);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                }
            });

            // 1
            cl1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b304_1);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLUE);
                    cl2.setTextColor(Color.BLACK);
                }
            });

            // 2
            cl2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b304_2);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLUE);
                }
            });
        }
    }

    // for bld 305
    public static class InternalMap305 extends AppCompatActivity {
        PhotoView photoView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_internal_map_305);

            photoView = (PhotoView)findViewById(R.id.images305);
            photoView.setImageResource(R.drawable.b305_1);

            final Button clb1 = (Button)findViewById(R.id.b_b1) ;
            final Button cl1 = (Button)findViewById(R.id.b_1) ;
            final Button cl2 = (Button)findViewById(R.id.b_2) ;
            final Button cl3 = (Button)findViewById(R.id.b_3) ;
            final Button cl4 = (Button)findViewById(R.id.b_4) ;
            final Button cl5 = (Button)findViewById(R.id.b_5) ;
            final Button cl6 = (Button)findViewById(R.id.b_6) ;
            final Button cl7 = (Button)findViewById(R.id.b_7) ;
            final Button cl8 = (Button)findViewById(R.id.b_8) ;
            final Button cl9 = (Button)findViewById(R.id.b_9) ;
            final Button cl10 = (Button)findViewById(R.id.b_10) ;



            // b1
            clb1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b305_b1);
                    clb1.setTextColor(Color.BLUE);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLACK);
                    cl9.setTextColor(Color.BLACK);
                    cl10.setTextColor(Color.BLACK);
                }
            });

            // 1
            cl1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b305_1);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLUE);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLACK);
                    cl9.setTextColor(Color.BLACK);
                    cl10.setTextColor(Color.BLACK);
                }
            });

            // 2
            cl2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b305_2);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLUE);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLACK);
                    cl9.setTextColor(Color.BLACK);
                    cl10.setTextColor(Color.BLACK);
                }
            });

            // 3
            cl3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b305_3);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLUE);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLACK);
                    cl9.setTextColor(Color.BLACK);
                    cl10.setTextColor(Color.BLACK);
                }
            });

            // 4
            cl4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b305_4);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLUE);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLACK);
                    cl9.setTextColor(Color.BLACK);
                    cl10.setTextColor(Color.BLACK);
                }
            });

            // 5
            cl5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b305_5);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLUE);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLACK);
                    cl9.setTextColor(Color.BLACK);
                    cl10.setTextColor(Color.BLACK);
                }
            });
            // 6
            cl6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b305_6);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLUE);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLACK);
                    cl9.setTextColor(Color.BLACK);
                    cl10.setTextColor(Color.BLACK);
                }
            });
            // 7
            cl7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b305_7);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLUE);
                    cl8.setTextColor(Color.BLACK);
                    cl9.setTextColor(Color.BLACK);
                    cl10.setTextColor(Color.BLACK);
                }
            });
            // 8
            cl8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b305_8);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLUE);
                    cl9.setTextColor(Color.BLACK);
                    cl10.setTextColor(Color.BLACK);
                }
            });
            // 9
            cl9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b305_9);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLACK);
                    cl9.setTextColor(Color.BLUE);
                    cl10.setTextColor(Color.BLACK);
                }
            });
            // 10
            cl10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b305_10);
                    clb1.setTextColor(Color.BLACK);
                    cl1.setTextColor(Color.BLACK);
                    cl2.setTextColor(Color.BLACK);
                    cl3.setTextColor(Color.BLACK);
                    cl4.setTextColor(Color.BLACK);
                    cl5.setTextColor(Color.BLACK);
                    cl6.setTextColor(Color.BLACK);
                    cl7.setTextColor(Color.BLACK);
                    cl8.setTextColor(Color.BLACK);
                    cl9.setTextColor(Color.BLACK);
                    cl10.setTextColor(Color.BLUE);
                }
            });
        }

    }

    // for bld 307
    public static class InternalMap307 extends AppCompatActivity {
        PhotoView photoView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_internal_map_307);

            photoView = (PhotoView)findViewById(R.id.images307);
            photoView.setImageResource(R.drawable.b307_b1);

            final Button clb2 = (Button)findViewById(R.id.b_b2) ;
            final Button clb1 = (Button)findViewById(R.id.b_b1) ;

            // b2
            clb2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b307_b2);
                    clb2.setTextColor(Color.BLUE);
                    clb1.setTextColor(Color.BLACK);
                }
            });

            // b1
            clb1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b307_b1);
                    clb2.setTextColor(Color.BLACK);
                    clb1.setTextColor(Color.BLUE);
                }
            });


        }

    }

    // for bld 310
    public static class InternalMap310 extends AppCompatActivity {
        PhotoView photoView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_internal_map_310);

            photoView = (PhotoView)findViewById(R.id.images310);
            photoView.setImageResource(R.drawable.b310_1);

            final Button beb6 = (Button)findViewById(R.id.be_b6) ;
            final Button beb5 = (Button)findViewById(R.id.be_b5) ;
            final Button beb4 = (Button)findViewById(R.id.be_b4) ;
            final Button beb3 = (Button)findViewById(R.id.be_b3) ;
            final Button beb2 = (Button)findViewById(R.id.be_b2) ;
            final Button beb1 = (Button)findViewById(R.id.be_b1) ;
            final Button be1 = (Button)findViewById(R.id.be_1) ;
            final Button be2 = (Button)findViewById(R.id.be_2) ;
            final Button be3 = (Button)findViewById(R.id.be_3) ;
            final Button be4 = (Button)findViewById(R.id.be_4) ;
            final Button be5 = (Button)findViewById(R.id.be_5) ;
            final Button be6 = (Button)findViewById(R.id.be_6) ;
            final Button be7 = (Button)findViewById(R.id.be_7) ;
            final Button be8 = (Button)findViewById(R.id.be_8) ;
            final Button be9 = (Button)findViewById(R.id.be_9) ;
            final Button be10 = (Button)findViewById(R.id.be_10) ;
            final Button be11 = (Button)findViewById(R.id.be_11) ;
            final Button be12 = (Button)findViewById(R.id.be_12) ;


            // b6
            beb6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b310_b6);
                    beb6.setTextColor(Color.BLUE);
                    beb5.setTextColor(Color.BLACK);
                    beb4.setTextColor(Color.BLACK);
                    beb3.setTextColor(Color.BLACK);
                    beb2.setTextColor(Color.BLACK);
                    beb1.setTextColor(Color.BLACK);
                    be1.setTextColor(Color.BLACK);
                    be2.setTextColor(Color.BLACK);
                    be3.setTextColor(Color.BLACK);
                    be4.setTextColor(Color.BLACK);
                    be5.setTextColor(Color.BLACK);
                    be6.setTextColor(Color.BLACK);
                    be7.setTextColor(Color.BLACK);
                    be8.setTextColor(Color.BLACK);
                    be9.setTextColor(Color.BLACK);
                    be10.setTextColor(Color.BLACK);
                    be11.setTextColor(Color.BLACK);
                    be12.setTextColor(Color.BLACK);

                }
            });

            // b5
            beb5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b310_b5);
                    beb6.setTextColor(Color.BLACK);
                    beb5.setTextColor(Color.BLUE);
                    beb4.setTextColor(Color.BLACK);
                    beb3.setTextColor(Color.BLACK);
                    beb2.setTextColor(Color.BLACK);
                    beb1.setTextColor(Color.BLACK);
                    be1.setTextColor(Color.BLACK);
                    be2.setTextColor(Color.BLACK);
                    be3.setTextColor(Color.BLACK);
                    be4.setTextColor(Color.BLACK);
                    be5.setTextColor(Color.BLACK);
                    be6.setTextColor(Color.BLACK);
                    be7.setTextColor(Color.BLACK);
                    be8.setTextColor(Color.BLACK);
                    be9.setTextColor(Color.BLACK);
                    be10.setTextColor(Color.BLACK);
                    be11.setTextColor(Color.BLACK);
                    be12.setTextColor(Color.BLACK);

                }
            });

            // b4
            beb4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b310_b4);
                    beb6.setTextColor(Color.BLACK);
                    beb5.setTextColor(Color.BLACK);
                    beb4.setTextColor(Color.BLUE);
                    beb3.setTextColor(Color.BLACK);
                    beb2.setTextColor(Color.BLACK);
                    beb1.setTextColor(Color.BLACK);
                    be1.setTextColor(Color.BLACK);
                    be2.setTextColor(Color.BLACK);
                    be3.setTextColor(Color.BLACK);
                    be4.setTextColor(Color.BLACK);
                    be5.setTextColor(Color.BLACK);
                    be6.setTextColor(Color.BLACK);
                    be7.setTextColor(Color.BLACK);
                    be8.setTextColor(Color.BLACK);
                    be9.setTextColor(Color.BLACK);
                    be10.setTextColor(Color.BLACK);
                    be11.setTextColor(Color.BLACK);
                    be12.setTextColor(Color.BLACK);

                }
            });

            // b3
            beb3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b310_b3);
                    beb6.setTextColor(Color.BLACK);
                    beb5.setTextColor(Color.BLACK);
                    beb4.setTextColor(Color.BLACK);
                    beb3.setTextColor(Color.BLUE);
                    beb2.setTextColor(Color.BLACK);
                    beb1.setTextColor(Color.BLACK);
                    be1.setTextColor(Color.BLACK);
                    be2.setTextColor(Color.BLACK);
                    be3.setTextColor(Color.BLACK);
                    be4.setTextColor(Color.BLACK);
                    be5.setTextColor(Color.BLACK);
                    be6.setTextColor(Color.BLACK);
                    be7.setTextColor(Color.BLACK);
                    be8.setTextColor(Color.BLACK);
                    be9.setTextColor(Color.BLACK);
                    be10.setTextColor(Color.BLACK);
                    be11.setTextColor(Color.BLACK);
                    be12.setTextColor(Color.BLACK);

                }
            });

            // b2
            beb2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b310_b2);
                    beb6.setTextColor(Color.BLACK);
                    beb5.setTextColor(Color.BLACK);
                    beb4.setTextColor(Color.BLACK);
                    beb3.setTextColor(Color.BLACK);
                    beb2.setTextColor(Color.BLUE);
                    beb1.setTextColor(Color.BLACK);
                    be1.setTextColor(Color.BLACK);
                    be2.setTextColor(Color.BLACK);
                    be3.setTextColor(Color.BLACK);
                    be4.setTextColor(Color.BLACK);
                    be5.setTextColor(Color.BLACK);
                    be6.setTextColor(Color.BLACK);
                    be7.setTextColor(Color.BLACK);
                    be8.setTextColor(Color.BLACK);
                    be9.setTextColor(Color.BLACK);
                    be10.setTextColor(Color.BLACK);
                    be11.setTextColor(Color.BLACK);
                    be12.setTextColor(Color.BLACK);

                }
            });

            // b1
            beb1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b310_b1);
                    beb6.setTextColor(Color.BLACK);
                    beb5.setTextColor(Color.BLACK);
                    beb4.setTextColor(Color.BLACK);
                    beb3.setTextColor(Color.BLACK);
                    beb2.setTextColor(Color.BLACK);
                    beb1.setTextColor(Color.BLUE);
                    be1.setTextColor(Color.BLACK);
                    be2.setTextColor(Color.BLACK);
                    be3.setTextColor(Color.BLACK);
                    be4.setTextColor(Color.BLACK);
                    be5.setTextColor(Color.BLACK);
                    be6.setTextColor(Color.BLACK);
                    be7.setTextColor(Color.BLACK);
                    be8.setTextColor(Color.BLACK);
                    be9.setTextColor(Color.BLACK);
                    be10.setTextColor(Color.BLACK);
                    be11.setTextColor(Color.BLACK);
                    be12.setTextColor(Color.BLACK);

                }
            });

            // 1
            be1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b310_1);
                    beb6.setTextColor(Color.BLACK);
                    beb5.setTextColor(Color.BLACK);
                    beb4.setTextColor(Color.BLACK);
                    beb3.setTextColor(Color.BLACK);
                    beb2.setTextColor(Color.BLACK);
                    beb1.setTextColor(Color.BLACK);
                    be1.setTextColor(Color.BLUE);
                    be2.setTextColor(Color.BLACK);
                    be3.setTextColor(Color.BLACK);
                    be4.setTextColor(Color.BLACK);
                    be5.setTextColor(Color.BLACK);
                    be6.setTextColor(Color.BLACK);
                    be7.setTextColor(Color.BLACK);
                    be8.setTextColor(Color.BLACK);
                    be9.setTextColor(Color.BLACK);
                    be10.setTextColor(Color.BLACK);
                    be11.setTextColor(Color.BLACK);
                    be12.setTextColor(Color.BLACK);

                }
            });

            // 2
            be2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b310_2);
                    beb6.setTextColor(Color.BLACK);
                    beb5.setTextColor(Color.BLACK);
                    beb4.setTextColor(Color.BLACK);
                    beb3.setTextColor(Color.BLACK);
                    beb2.setTextColor(Color.BLACK);
                    beb1.setTextColor(Color.BLACK);
                    be1.setTextColor(Color.BLACK);
                    be2.setTextColor(Color.BLUE);
                    be3.setTextColor(Color.BLACK);
                    be4.setTextColor(Color.BLACK);
                    be5.setTextColor(Color.BLACK);
                    be6.setTextColor(Color.BLACK);
                    be7.setTextColor(Color.BLACK);
                    be8.setTextColor(Color.BLACK);
                    be9.setTextColor(Color.BLACK);
                    be10.setTextColor(Color.BLACK);
                    be11.setTextColor(Color.BLACK);
                    be12.setTextColor(Color.BLACK);

                }
            });

            // 3
            be3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b310_3);
                    beb6.setTextColor(Color.BLACK);
                    beb5.setTextColor(Color.BLACK);
                    beb4.setTextColor(Color.BLACK);
                    beb3.setTextColor(Color.BLACK);
                    beb2.setTextColor(Color.BLACK);
                    beb1.setTextColor(Color.BLACK);
                    be1.setTextColor(Color.BLACK);
                    be2.setTextColor(Color.BLACK);
                    be3.setTextColor(Color.BLUE);
                    be4.setTextColor(Color.BLACK);
                    be5.setTextColor(Color.BLACK);
                    be6.setTextColor(Color.BLACK);
                    be7.setTextColor(Color.BLACK);
                    be8.setTextColor(Color.BLACK);
                    be9.setTextColor(Color.BLACK);
                    be10.setTextColor(Color.BLACK);
                    be11.setTextColor(Color.BLACK);
                    be12.setTextColor(Color.BLACK);
                }
            });

            // 4
            be4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b310_4);
                    beb6.setTextColor(Color.BLACK);
                    beb5.setTextColor(Color.BLACK);
                    beb4.setTextColor(Color.BLACK);
                    beb3.setTextColor(Color.BLACK);
                    beb2.setTextColor(Color.BLACK);
                    beb1.setTextColor(Color.BLACK);
                    be1.setTextColor(Color.BLACK);
                    be2.setTextColor(Color.BLACK);
                    be3.setTextColor(Color.BLACK);
                    be4.setTextColor(Color.BLUE);
                    be5.setTextColor(Color.BLACK);
                    be6.setTextColor(Color.BLACK);
                    be7.setTextColor(Color.BLACK);
                    be8.setTextColor(Color.BLACK);
                    be9.setTextColor(Color.BLACK);
                    be10.setTextColor(Color.BLACK);
                    be11.setTextColor(Color.BLACK);
                    be12.setTextColor(Color.BLACK);
                }
            });

            // 5
            be5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b310_5);
                    beb6.setTextColor(Color.BLACK);
                    beb5.setTextColor(Color.BLACK);
                    beb4.setTextColor(Color.BLACK);
                    beb3.setTextColor(Color.BLACK);
                    beb2.setTextColor(Color.BLACK);
                    beb1.setTextColor(Color.BLACK);
                    be1.setTextColor(Color.BLACK);
                    be2.setTextColor(Color.BLACK);
                    be3.setTextColor(Color.BLACK);
                    be4.setTextColor(Color.BLACK);
                    be5.setTextColor(Color.BLUE);
                    be6.setTextColor(Color.BLACK);
                    be7.setTextColor(Color.BLACK);
                    be8.setTextColor(Color.BLACK);
                    be9.setTextColor(Color.BLACK);
                    be10.setTextColor(Color.BLACK);
                    be11.setTextColor(Color.BLACK);
                    be12.setTextColor(Color.BLACK);
                }
            });

            // 6
            be6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b310_6);
                    beb6.setTextColor(Color.BLACK);
                    beb5.setTextColor(Color.BLACK);
                    beb4.setTextColor(Color.BLACK);
                    beb3.setTextColor(Color.BLACK);
                    beb2.setTextColor(Color.BLACK);
                    beb1.setTextColor(Color.BLACK);
                    be1.setTextColor(Color.BLACK);
                    be2.setTextColor(Color.BLACK);
                    be3.setTextColor(Color.BLACK);
                    be4.setTextColor(Color.BLACK);
                    be5.setTextColor(Color.BLACK);
                    be6.setTextColor(Color.BLUE);
                    be7.setTextColor(Color.BLACK);
                    be8.setTextColor(Color.BLACK);
                    be9.setTextColor(Color.BLACK);
                    be10.setTextColor(Color.BLACK);
                    be11.setTextColor(Color.BLACK);
                    be12.setTextColor(Color.BLACK);
                }
            });

            // 7
            be7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b310_7);
                    beb6.setTextColor(Color.BLACK);
                    beb5.setTextColor(Color.BLACK);
                    beb4.setTextColor(Color.BLACK);
                    beb3.setTextColor(Color.BLACK);
                    beb2.setTextColor(Color.BLACK);
                    beb1.setTextColor(Color.BLACK);
                    be1.setTextColor(Color.BLACK);
                    be2.setTextColor(Color.BLACK);
                    be3.setTextColor(Color.BLACK);
                    be4.setTextColor(Color.BLACK);
                    be5.setTextColor(Color.BLACK);
                    be6.setTextColor(Color.BLACK);
                    be7.setTextColor(Color.BLUE);
                    be8.setTextColor(Color.BLACK);
                    be9.setTextColor(Color.BLACK);
                    be10.setTextColor(Color.BLACK);
                    be11.setTextColor(Color.BLACK);
                    be12.setTextColor(Color.BLACK);
                }
            });

            // 8
            be8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b310_8);
                    beb6.setTextColor(Color.BLACK);
                    beb5.setTextColor(Color.BLACK);
                    beb4.setTextColor(Color.BLACK);
                    beb3.setTextColor(Color.BLACK);
                    beb2.setTextColor(Color.BLACK);
                    beb1.setTextColor(Color.BLACK);
                    be1.setTextColor(Color.BLACK);
                    be2.setTextColor(Color.BLACK);
                    be3.setTextColor(Color.BLACK);
                    be4.setTextColor(Color.BLACK);
                    be5.setTextColor(Color.BLACK);
                    be6.setTextColor(Color.BLACK);
                    be7.setTextColor(Color.BLACK);
                    be8.setTextColor(Color.BLUE);
                    be9.setTextColor(Color.BLACK);
                    be10.setTextColor(Color.BLACK);
                    be11.setTextColor(Color.BLACK);
                    be12.setTextColor(Color.BLACK);
                }
            });

            // 9
            be9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b310_9);
                    beb6.setTextColor(Color.BLACK);
                    beb5.setTextColor(Color.BLACK);
                    beb4.setTextColor(Color.BLACK);
                    beb3.setTextColor(Color.BLACK);
                    beb2.setTextColor(Color.BLACK);
                    beb1.setTextColor(Color.BLACK);
                    be1.setTextColor(Color.BLACK);
                    be2.setTextColor(Color.BLACK);
                    be3.setTextColor(Color.BLACK);
                    be4.setTextColor(Color.BLACK);
                    be5.setTextColor(Color.BLACK);
                    be6.setTextColor(Color.BLACK);
                    be7.setTextColor(Color.BLACK);
                    be8.setTextColor(Color.BLACK);
                    be9.setTextColor(Color.BLUE);
                    be10.setTextColor(Color.BLACK);
                    be11.setTextColor(Color.BLACK);
                    be12.setTextColor(Color.BLACK);
                }
            });

            // 10
            be10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b310_10);
                    beb6.setTextColor(Color.BLACK);
                    beb5.setTextColor(Color.BLACK);
                    beb4.setTextColor(Color.BLACK);
                    beb3.setTextColor(Color.BLACK);
                    beb2.setTextColor(Color.BLACK);
                    beb1.setTextColor(Color.BLACK);
                    be1.setTextColor(Color.BLACK);
                    be2.setTextColor(Color.BLACK);
                    be3.setTextColor(Color.BLACK);
                    be4.setTextColor(Color.BLACK);
                    be5.setTextColor(Color.BLACK);
                    be6.setTextColor(Color.BLACK);
                    be7.setTextColor(Color.BLACK);
                    be8.setTextColor(Color.BLACK);
                    be9.setTextColor(Color.BLACK);
                    be10.setTextColor(Color.BLUE);
                    be11.setTextColor(Color.BLACK);
                    be12.setTextColor(Color.BLACK);
                }
            });

            // 11
            be11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b310_11);
                    beb6.setTextColor(Color.BLACK);
                    beb5.setTextColor(Color.BLACK);
                    beb4.setTextColor(Color.BLACK);
                    beb3.setTextColor(Color.BLACK);
                    beb2.setTextColor(Color.BLACK);
                    beb1.setTextColor(Color.BLACK);
                    be1.setTextColor(Color.BLACK);
                    be2.setTextColor(Color.BLACK);
                    be3.setTextColor(Color.BLACK);
                    be4.setTextColor(Color.BLACK);
                    be5.setTextColor(Color.BLACK);
                    be6.setTextColor(Color.BLACK);
                    be7.setTextColor(Color.BLACK);
                    be8.setTextColor(Color.BLACK);
                    be9.setTextColor(Color.BLACK);
                    be10.setTextColor(Color.BLACK);
                    be11.setTextColor(Color.BLUE);
                    be12.setTextColor(Color.BLACK);
                }
            });

            // 12
            be12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    photoView.setImageResource(R.drawable.b310_12);
                    beb6.setTextColor(Color.BLACK);
                    beb5.setTextColor(Color.BLACK);
                    beb4.setTextColor(Color.BLACK);
                    beb3.setTextColor(Color.BLACK);
                    beb2.setTextColor(Color.BLACK);
                    beb1.setTextColor(Color.BLACK);
                    be1.setTextColor(Color.BLACK);
                    be2.setTextColor(Color.BLACK);
                    be3.setTextColor(Color.BLACK);
                    be4.setTextColor(Color.BLACK);
                    be5.setTextColor(Color.BLACK);
                    be6.setTextColor(Color.BLACK);
                    be7.setTextColor(Color.BLACK);
                    be8.setTextColor(Color.BLACK);
                    be9.setTextColor(Color.BLACK);
                    be10.setTextColor(Color.BLACK);
                    be11.setTextColor(Color.BLACK);
                    be12.setTextColor(Color.BLUE);
                }
            });
        }

    }

}