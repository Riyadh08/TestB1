package com.example.labtestb1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

class Shape{
    public String name ;

    public Shape(String name){
        this.name = name ;
    }

    public String showShape() {
        return "The shape is " + name + "\n" + "Area is " + area() + "\n" + "Perimeter is " + perimeter() + "\n";
    }

    public float area(){
        return 0;
    }

    public float perimeter(){
        return 0;
    }
}

class Circle extends Shape{
    public  float radius ;

    public Circle(float radius){
        super("Circle");
        this.radius = radius ;
    }

    public float area(){
        return (float) (3.14 * radius * radius);
    }

    public float perimeter(){
        return (float) (2 * 3.14 * radius);
    }

}

class Square extends Shape{
    public  float side ;

    public Square(float side){
        super("Square");
        this.side = side ;
    }

    public float area(){
        return side * side;
    }

    public float perimeter(){
        return 4 * side;
    }
}

class Triangle extends Shape{
    public  float side1 ;
    public  float side2 ;
    public  float side3 ;

    public Triangle(float side1, float side2, float side3){
        super("Triangle");
        this.side1 = side1 ;
        this.side2 = side2 ;
        this.side3 = side3 ;
    }

    public float area(){
        float s = (side1 + side2 + side3) / 2;
        return (float) Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}

class Color{
    public String name ;

    public Color(String name){
        this.name = name ;
    }

    public String showColor(){
        return "The color is " + name + "\n";
    }
}
class Red extends Color{
    public Red(){
        super("Red");
    }
}
class Green extends Color{
    public Green(){
        super("Green");
    }
}
class Blue extends Color{
    public Blue(){
        super("Blue");
    }
}
public class MainActivity extends AppCompatActivity {

    public EditText ShapeEditText,ColorEditText ;
    public TextView ShapeTextView,ColorTextView ;
    public Button button ;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ShapeEditText = findViewById(R.id.ShapeEditText);
        ColorEditText = findViewById(R.id.ColorEditText);
        ShapeTextView = findViewById(R.id.ShapeTextView);
        ColorTextView = findViewById(R.id.ColorTextView);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String shape = ShapeEditText.getText().toString();
                String color = ColorEditText.getText().toString();

                if(shape.equals("Circle")){
                    Circle c = new Circle(5);
                    ShapeTextView.setText(c.showShape());
                }
                else if(shape.equals("Square")){
                    Square s = new Square(5);
                    ShapeTextView.setText(s.showShape());
                }
                else if(shape.equals("Triangle")){
                    Triangle t = new Triangle(3, 4, 5);
                    ShapeTextView.setText(t.showShape());
                }
                else{
                    ShapeTextView.setText("Invalid Shape");
                }

                if(color.equals("Red")){
                    Red r = new Red();
                    ColorTextView.setText(r.showColor());
                }
                else if(color.equals("Green")){
                    Green g = new Green();
                    ColorTextView.setText(g.showColor());
                }
                else if(color.equals("Blue")){
                    Blue b = new Blue();
                    ColorTextView.setText(b.showColor());
                }
                else{
                    ColorTextView.setText("Invalid Color");
                }
            }
        });


    }
}