package com.example.tictactoe;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    int playerTurn=0;
    int movesCounter=0;
    ImageView imageView;
    LinkedList<Integer>winningPlace1=new LinkedList<>();
    LinkedList<Integer>winningPlace2=new LinkedList<>();
    LinkedList<Integer>winningPlace3=new LinkedList<>();
    LinkedList<Integer>winningPlace4=new LinkedList<>();
    LinkedList<Integer>winningPlace5=new LinkedList<>();
    LinkedList<Integer>winningPlace6=new LinkedList<>();
    LinkedList<Integer>winningPlace7=new LinkedList<>();
    LinkedList<Integer>winningPlace8=new LinkedList<>();
    LinkedList<Integer>xPlaces=new LinkedList<>();
    LinkedList<Integer>oPlaces=new LinkedList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addToWinningPlace1();addToWinningPlace2();addToWinningPlace3();addToWinningPlace4();
        addToWinningPlace5();addToWinningPlace6();addToWinningPlace7();addToWinningPlace8();

    }


    public void addToWinningPlace1(){winningPlace1.add(1);winningPlace1.add(2);winningPlace1.add(3);}
    public void addToWinningPlace2(){winningPlace2.add(4);winningPlace2.add(5);winningPlace2.add(6);}
    public void addToWinningPlace3(){winningPlace3.add(7);winningPlace3.add(8);winningPlace3.add(9);}
    public void addToWinningPlace4(){winningPlace4.add(1);winningPlace4.add(5);winningPlace4.add(9);}
    public void addToWinningPlace5(){winningPlace5.add(3);winningPlace5.add(5);winningPlace5.add(7);}
    public void addToWinningPlace6(){winningPlace6.add(1);winningPlace6.add(4);winningPlace6.add(7);}
    public void addToWinningPlace7(){winningPlace7.add(2);winningPlace7.add(5);winningPlace7.add(8);}
    public void addToWinningPlace8(){winningPlace8.add(3);winningPlace8.add(6);winningPlace8.add(9);}







    public boolean isXWon(){
        if(xPlaces.containsAll(winningPlace1))return true;
        else if(xPlaces.containsAll(winningPlace2))return true;
        else if(xPlaces.containsAll(winningPlace3))return true;
        else if(xPlaces.containsAll(winningPlace4))return true;
        else if(xPlaces.containsAll(winningPlace5))return true;
        else if(xPlaces.containsAll(winningPlace6))return true;
        else if(xPlaces.containsAll(winningPlace7))return true;
        else if(xPlaces.containsAll(winningPlace8))return true;
        else return false;
    }

    public boolean isOWon(){
        if(xPlaces.containsAll(winningPlace1))return true;
        else if(oPlaces.containsAll(winningPlace2))return true;
        else if(oPlaces.containsAll(winningPlace3))return true;
        else if(oPlaces.containsAll(winningPlace4))return true;
        else if(oPlaces.containsAll(winningPlace5))return true;
        else if(oPlaces.containsAll(winningPlace6))return true;
        else if(oPlaces.containsAll(winningPlace7))return true;
        else if(oPlaces.containsAll(winningPlace8))return true;
        else return false;
    }



    public void checkXorO(View view) {
        if(playerTurn==0){
            setSrcX(Integer.parseInt(String.valueOf(view.getTag())));
            xPlaces.add(Integer.parseInt(String.valueOf(view.getTag())));
            playerTurn=1;
            if(isXWon()){createWinningDialog("X");}
            movesCounter++;
            if(movesCounter==9&&!isXWon())createDrawDialog();
        }else{
            setSrcO(Integer.parseInt(String.valueOf(view.getTag())));
            oPlaces.add(Integer.parseInt(String.valueOf(view.getTag())));
            playerTurn=0;
            if(isOWon()){createWinningDialog("O");}
            movesCounter++;
            if(movesCounter==9&&!isOWon())createDrawDialog();
        }
    }


    public void setSrcX(int imgTag){
        switch (imgTag){
            case 1:
                imageView=findViewById(R.id.img1);imageView.setImageResource(R.drawable.x);break;
            case 2:
                imageView=findViewById(R.id.img2);imageView.setImageResource(R.drawable.x);break;
            case 3:
                imageView=findViewById(R.id.img3);imageView.setImageResource(R.drawable.x);break;
            case 4:
                imageView=findViewById(R.id.img4);imageView.setImageResource(R.drawable.x);break;
            case 5:
                imageView=findViewById(R.id.img5);imageView.setImageResource(R.drawable.x);break;
            case 6:
                imageView=findViewById(R.id.img6);imageView.setImageResource(R.drawable.x);break;
            case 7:
                imageView=findViewById(R.id.img7);imageView.setImageResource(R.drawable.x);break;
            case 8:
                imageView=findViewById(R.id.img8);imageView.setImageResource(R.drawable.x);break;
            case 9:
                imageView=findViewById(R.id.img9);imageView.setImageResource(R.drawable.x);break;
        }
    }



    public void setSrcO(int imgTag){
        switch (imgTag){
            case 1:
                imageView=findViewById(R.id.img1);imageView.setImageResource(R.drawable.o);break;
            case 2:
                imageView=findViewById(R.id.img2);imageView.setImageResource(R.drawable.o);break;
            case 3:
                imageView=findViewById(R.id.img3);imageView.setImageResource(R.drawable.o);break;
            case 4:
                imageView=findViewById(R.id.img4);imageView.setImageResource(R.drawable.o);break;
            case 5:
                imageView=findViewById(R.id.img5);imageView.setImageResource(R.drawable.o);break;
            case 6:
                imageView=findViewById(R.id.img6);imageView.setImageResource(R.drawable.o);break;
            case 7:
                imageView=findViewById(R.id.img7);imageView.setImageResource(R.drawable.o);break;
            case 8:
                imageView=findViewById(R.id.img8);imageView.setImageResource(R.drawable.o);break;
            case 9:
                imageView=findViewById(R.id.img9);imageView.setImageResource(R.drawable.o);break;
        }
    }



    public void playAgain(){
        Intent intent=new Intent(MainActivity.this,MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void createWinningDialog(String winner){
        new AlertDialog.Builder(MainActivity.this)
                .setTitle("congraturlations!!")
                .setMessage(winner+" has won the game!")
                .setCancelable(false)
                .setNegativeButton("", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {}})
                .setPositiveButton("play again!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        playAgain();
                    }}).show();
    }


    public void createDrawDialog(){
        new AlertDialog.Builder(MainActivity.this)
                .setTitle("DRAW!!")
                .setCancelable(false)
                .setNegativeButton("", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {}})
                .setPositiveButton("play again!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        playAgain();
                    }}).show();
    }






}