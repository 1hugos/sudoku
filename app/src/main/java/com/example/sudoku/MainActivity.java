package com.example.sudoku;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private final List<TextView> allTextView = new ArrayList<>();
    private final List<GridLayout> allInnerSquares = new ArrayList<>();

    TextView cell11;
    TextView cell12;
    TextView cell13;
    TextView cell14;
    TextView cell15;
    TextView cell16;
    TextView cell17;
    TextView cell18;
    TextView cell19;

    TextView cell21;
    TextView cell22;
    TextView cell23;
    TextView cell24;
    TextView cell25;
    TextView cell26;
    TextView cell27;
    TextView cell28;
    TextView cell29;

    TextView cell31;
    TextView cell32;
    TextView cell33;
    TextView cell34;
    TextView cell35;
    TextView cell36;
    TextView cell37;
    TextView cell38;
    TextView cell39;

    TextView cell41;
    TextView cell42;
    TextView cell43;
    TextView cell44;
    TextView cell45;
    TextView cell46;
    TextView cell47;
    TextView cell48;
    TextView cell49;

    TextView cell51;
    TextView cell52;
    TextView cell53;
    TextView cell54;
    TextView cell55;
    TextView cell56;
    TextView cell57;
    TextView cell58;
    TextView cell59;

    TextView cell61;
    TextView cell62;
    TextView cell63;
    TextView cell64;
    TextView cell65;
    TextView cell66;
    TextView cell67;
    TextView cell68;
    TextView cell69;

    TextView cell71;
    TextView cell72;
    TextView cell73;
    TextView cell74;
    TextView cell75;
    TextView cell76;
    TextView cell77;
    TextView cell78;
    TextView cell79;

    TextView cell81;
    TextView cell82;
    TextView cell83;
    TextView cell84;
    TextView cell85;
    TextView cell86;
    TextView cell87;
    TextView cell88;
    TextView cell89;

    TextView cell91;
    TextView cell92;
    TextView cell93;
    TextView cell94;
    TextView cell95;
    TextView cell96;
    TextView cell97;
    TextView cell98;
    TextView cell99;

    Button oneBtn;
    Button twoBtn;
    Button threeBtn;
    Button fourBtn;
    Button fiveBtn;
    Button sixBtn;
    Button sevenBtn;
    Button eightBtn;
    Button nineBtn;

    GridLayout innerSquare11;
    GridLayout innerSquare12;
    GridLayout innerSquare13;
    GridLayout innerSquare21;
    GridLayout innerSquare22;
    GridLayout innerSquare23;
    GridLayout innerSquare31;
    GridLayout innerSquare32;
    GridLayout innerSquare33;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        oneBtn = (Button) findViewById(R.id.oneButton);
        twoBtn = (Button) findViewById(R.id.twoButton);
        threeBtn = (Button) findViewById(R.id.threeButton);
        fourBtn = (Button) findViewById(R.id.fourButton);
        fiveBtn = (Button) findViewById(R.id.fiveButton);
        sixBtn = (Button) findViewById(R.id.sixButton);
        sevenBtn = (Button) findViewById(R.id.sevenButton);
        eightBtn = (Button) findViewById(R.id.eightButton);
        nineBtn = (Button) findViewById(R.id.nineButton);

        //first row
        allTextView.add(cell11 = (TextView) findViewById(R.id.cell11));
        allTextView.add(cell12 = (TextView) findViewById(R.id.cell12));
        allTextView.add(cell13 = (TextView) findViewById(R.id.cell13));
        allTextView.add(cell14 = (TextView) findViewById(R.id.cell14));
        allTextView.add(cell15 = (TextView) findViewById(R.id.cell15));
        allTextView.add(cell16 = (TextView) findViewById(R.id.cell16));
        allTextView.add(cell17 = (TextView) findViewById(R.id.cell17));
        allTextView.add(cell18 = (TextView) findViewById(R.id.cell18));
        allTextView.add(cell19 = (TextView) findViewById(R.id.cell19));

        //second row
        allTextView.add(cell21 = (TextView) findViewById(R.id.cell21));
        allTextView.add(cell22 = (TextView) findViewById(R.id.cell22));
        allTextView.add(cell23 = (TextView) findViewById(R.id.cell23));
        allTextView.add(cell24 = (TextView) findViewById(R.id.cell24));
        allTextView.add(cell25 = (TextView) findViewById(R.id.cell25));
        allTextView.add(cell26 = (TextView) findViewById(R.id.cell26));
        allTextView.add(cell27 = (TextView) findViewById(R.id.cell27));
        allTextView.add(cell28 = (TextView) findViewById(R.id.cell28));
        allTextView.add(cell29 = (TextView) findViewById(R.id.cell29));

        //third row
        allTextView.add(cell31 = (TextView) findViewById(R.id.cell31));
        allTextView.add(cell32 = (TextView) findViewById(R.id.cell32));
        allTextView.add(cell33 = (TextView) findViewById(R.id.cell33));
        allTextView.add(cell34 = (TextView) findViewById(R.id.cell34));
        allTextView.add(cell35 = (TextView) findViewById(R.id.cell35));
        allTextView.add(cell36 = (TextView) findViewById(R.id.cell36));
        allTextView.add(cell37 = (TextView) findViewById(R.id.cell37));
        allTextView.add(cell38 = (TextView) findViewById(R.id.cell38));
        allTextView.add(cell39 = (TextView) findViewById(R.id.cell39));

        //fourth row
        allTextView.add(cell41 = (TextView) findViewById(R.id.cell41));
        allTextView.add(cell42 = (TextView) findViewById(R.id.cell42));
        allTextView.add(cell43 = (TextView) findViewById(R.id.cell43));
        allTextView.add(cell44 = (TextView) findViewById(R.id.cell44));
        allTextView.add(cell45 = (TextView) findViewById(R.id.cell45));
        allTextView.add(cell46 = (TextView) findViewById(R.id.cell46));
        allTextView.add(cell47 = (TextView) findViewById(R.id.cell47));
        allTextView.add(cell48 = (TextView) findViewById(R.id.cell48));
        allTextView.add(cell49 = (TextView) findViewById(R.id.cell49));

        //fifth row
        allTextView.add(cell51 = (TextView) findViewById(R.id.cell51));
        allTextView.add(cell52 = (TextView) findViewById(R.id.cell52));
        allTextView.add(cell53 = (TextView) findViewById(R.id.cell53));
        allTextView.add(cell54 = (TextView) findViewById(R.id.cell54));
        allTextView.add(cell55 = (TextView) findViewById(R.id.cell55));
        allTextView.add(cell56 = (TextView) findViewById(R.id.cell56));
        allTextView.add(cell57 = (TextView) findViewById(R.id.cell57));
        allTextView.add(cell58 = (TextView) findViewById(R.id.cell58));
        allTextView.add(cell59 = (TextView) findViewById(R.id.cell59));

        //sixth row
        allTextView.add(cell61 = (TextView) findViewById(R.id.cell61));
        allTextView.add(cell62 = (TextView) findViewById(R.id.cell62));
        allTextView.add(cell63 = (TextView) findViewById(R.id.cell63));
        allTextView.add(cell64 = (TextView) findViewById(R.id.cell64));
        allTextView.add(cell65 = (TextView) findViewById(R.id.cell65));
        allTextView.add(cell66 = (TextView) findViewById(R.id.cell66));
        allTextView.add(cell67 = (TextView) findViewById(R.id.cell67));
        allTextView.add(cell68 = (TextView) findViewById(R.id.cell68));
        allTextView.add(cell69 = (TextView) findViewById(R.id.cell69));

        //seventh
        allTextView.add(cell71 = (TextView) findViewById(R.id.cell71));
        allTextView.add(cell72 = (TextView) findViewById(R.id.cell72));
        allTextView.add(cell73 = (TextView) findViewById(R.id.cell73));
        allTextView.add(cell74 = (TextView) findViewById(R.id.cell74));
        allTextView.add(cell75 = (TextView) findViewById(R.id.cell75));
        allTextView.add(cell76 = (TextView) findViewById(R.id.cell76));
        allTextView.add(cell77 = (TextView) findViewById(R.id.cell77));
        allTextView.add(cell78 = (TextView) findViewById(R.id.cell78));
        allTextView.add(cell79 = (TextView) findViewById(R.id.cell79));

        //eighth row
        allTextView.add(cell81 = (TextView) findViewById(R.id.cell81));
        allTextView.add(cell82 = (TextView) findViewById(R.id.cell82));
        allTextView.add(cell83 = (TextView) findViewById(R.id.cell83));
        allTextView.add(cell84 = (TextView) findViewById(R.id.cell84));
        allTextView.add(cell85 = (TextView) findViewById(R.id.cell85));
        allTextView.add(cell86 = (TextView) findViewById(R.id.cell86));
        allTextView.add(cell87 = (TextView) findViewById(R.id.cell87));
        allTextView.add(cell88 = (TextView) findViewById(R.id.cell88));
        allTextView.add(cell89 = (TextView) findViewById(R.id.cell89));

        //ninth row
        allTextView.add(cell91 = (TextView) findViewById(R.id.cell91));
        allTextView.add(cell92 = (TextView) findViewById(R.id.cell92));
        allTextView.add(cell93 = (TextView) findViewById(R.id.cell93));
        allTextView.add(cell94 = (TextView) findViewById(R.id.cell94));
        allTextView.add(cell95 = (TextView) findViewById(R.id.cell95));
        allTextView.add(cell96 = (TextView) findViewById(R.id.cell96));
        allTextView.add(cell97 = (TextView) findViewById(R.id.cell97));
        allTextView.add(cell98 = (TextView) findViewById(R.id.cell98));
        allTextView.add(cell99 = (TextView) findViewById(R.id.cell99));

        //inner squares
        allInnerSquares.add(innerSquare11 = (GridLayout) findViewById(R.id.innerSquare11));
        allInnerSquares.add(innerSquare12 = (GridLayout) findViewById(R.id.innerSquare12));
        allInnerSquares.add(innerSquare13 = (GridLayout) findViewById(R.id.innerSquare13));
        allInnerSquares.add(innerSquare21 = (GridLayout) findViewById(R.id.innerSquare21));
        allInnerSquares.add(innerSquare22 = (GridLayout) findViewById(R.id.innerSquare22));
        allInnerSquares.add(innerSquare23 = (GridLayout) findViewById(R.id.innerSquare23));
        allInnerSquares.add(innerSquare31 = (GridLayout) findViewById(R.id.innerSquare31));
        allInnerSquares.add(innerSquare32 = (GridLayout) findViewById(R.id.innerSquare32));
        allInnerSquares.add(innerSquare33 = (GridLayout) findViewById(R.id.innerSquare33));

        if (Build.VERSION.SDK_INT <= Build.VERSION_CODES.LOLLIPOP) {
            Toast.makeText(this, "System version is too old", Toast.LENGTH_LONG).show();
        }
    }

    private int[][] board;

    public boolean isBoardSolvedCorrectly() {
        boolean isSolvedCorrectly = true;

        int index = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                String valueInTextView = allTextView.get(index).getText().toString();
                String valueInBoard = String.valueOf(board[i][j]);
                if (!valueInTextView.equals((valueInBoard))) {
                    isSolvedCorrectly = false;
                }
                index++;
            }
        }
        return isSolvedCorrectly;
    }

    public void msgBoardSolved(View view){
        boolean isSolvedCorrectly = isBoardSolvedCorrectly();

        if (isSolvedCorrectly) {
            Toast.makeText(this, "\t\t\t\t\t\tGRATULACJE!!!\nPoprawnie rozwiązałeś sudoku!", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Sudoku nie zostało rozwiązane :(", Toast.LENGTH_LONG).show();
        }
    }

    public void randomHintForUser(View view) {
        try {
            if(!isBoardSolvedCorrectly()){
                int[][] hintBoard = new int[9][9];

                int index = 0;
                Random rand = new Random();

                for (int i = 0; i < 9; i++) {
                    for (int j = 0; j < 9; j++) {
                        if (allTextView.get(index).getText() == "") {
                            hintBoard[i][j] = board[i][j];
                        } else {
                            hintBoard[i][j] = 0;
                        }
                        index++;
                    }
                }

                boolean isHintCorrect = true;

                while(isHintCorrect){
                    int randomValue = rand.nextInt(9) + 1;
                    int randRow = rand.nextInt(9);
                    int randCol = rand.nextInt(9);

                    if(hintBoard[randRow][randCol] != 0){
                        if(hintBoard[randRow][randCol] == randomValue){
                            clearAllTextView();

                            String cellName = "cell" + (randRow + 1) + (randCol + 1);
                            TextView hintTextView = findViewById(getResources().getIdentifier(cellName, "id", getPackageName()));
                            hintTextView.setText(String.valueOf(hintBoard[randRow][randCol]));
                            hintTextView.setBackground(getResources().getDrawable(R.drawable.hint_bg_with_border));
                            GridLayout grid = (GridLayout) hintTextView.getParent();
                            grid.setBackground(getResources().getDrawable(R.drawable.inner_grid_bg));

                            showHorizontalVerticalTextView(randRow + 1 , randCol + 1);
                            isHintCorrect = false;
                        }
                    }
                }
            }

        } catch (Exception e) {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG).show();
        }
    }
    private TextView selectedTextView;

    public void onTextViewClicked(View view) {

        clearAllTextView();

        selectedTextView = (TextView) view;

        String selectedTextViewIdName = getResources().getResourceEntryName(selectedTextView.getId());

        int row = Integer.parseInt(selectedTextViewIdName.substring(4, 5));
        int col = Integer.parseInt(selectedTextViewIdName.substring(5));

        showHorizontalVerticalTextView(row, col);

        GridLayout grid = (GridLayout) selectedTextView.getParent();
        grid.setBackground(getResources().getDrawable(R.drawable.inner_grid_bg));
        selectedTextView.setBackground(getResources().getDrawable(R.drawable.textview_background_with_border));
    }

    public void onButtonClicked(View view) {
        if (selectedTextView != null) {
            Button button = (Button) view;
            String buttonText = button.getText().toString();
            selectedTextView.setText(buttonText);
        }
    }

    private void showHorizontalVerticalTextView(int row, int col) {
        for (int i = 1; i <= 9; i++) {

            if (i != col) {
                String cellName = "cell" + row + i;

                TextView horizontalTextView = findViewById(getResources().getIdentifier(cellName, "id", getPackageName()));

                horizontalTextView.setBackground(getResources().getDrawable(R.drawable.horizontal_vertical_textview_bg_with_border));
            }
            if (i != row) {
                int verticalTextViewId = getResources().getIdentifier("cell" + i + col, "id", getPackageName());
                TextView verticalTextView = findViewById(verticalTextViewId);
                verticalTextView.setBackground(getResources().getDrawable(R.drawable.horizontal_vertical_textview_bg_with_border));
            }
        }
    }

    private void clearAllTextView() {
        for (TextView t : allTextView) {
            t.setBackground(getResources().getDrawable(R.drawable.default_textview_background_with_border));
        }
        for (GridLayout g : allInnerSquares) {
            g.setBackground(getResources().getDrawable(R.drawable.default_inner_grid_bg));
        }
    }

    @SuppressLint("SetTextI18n")
    public void fillSudokuBoard(View v) {
        board = createSudokuBoard();

        try {
            clearAllTextView();
            int index = 0;
            Random rand = new Random();

            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    allTextView.get(index).setClickable(true);

                    if (rand.nextInt(2) > 0) {
                        allTextView.get(index).setText(board[i][j] + "");
                        allTextView.get(index).setClickable(false);
                    } else {
                        allTextView.get(index).setText("");
                    }
                    index++;
                }
            }
        } catch (Exception e) {
            Toast.makeText(getBaseContext(), e.getMessage(), Toast.LENGTH_LONG).show();
        }
    }

    public static int[][] createSudokuBoard() {
        int[][] board = new int[9][9];
        fillDiagonalBlocks(board);
        fillRemainingCells(board, 0, 3);
        return board;
    }

    private static void fillDiagonalBlocks(int[][] board) {
        for (int i = 0; i < 9; i += 3) {
            fillBlock(board, i, i);
        }
    }

    private static void fillBlock(int[][] board, int row, int col) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        int index = 0;
        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {
                board[i][j] = numbers.get(index);
                index++;
            }
        }
    }

    private static boolean fillRemainingCells(int[][] board, int row, int col) {
        if (col >= 9) {
            row++;
            col = 0;
        }
        if (row >= 9) {
            return true;
        }
        if (board[row][col] != 0) {
            return fillRemainingCells(board, row, col + 1);
        }
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        for (int num : numbers) {
            if (isValid(board, row, col, num)) {
                board[row][col] = num;
                if (fillRemainingCells(board, row, col + 1)) {
                    return true;
                }
                board[row][col] = 0;
            }
        }
        return false;
    }

    private static boolean isValid(int[][] board, int row, int col, int num) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num || board[i][col] == num) {
                return false;
            }
        }
        int blockRow = row - row % 3;
        int blockCol = col - col % 3;
        for (int i = blockRow; i < blockRow + 3; i++) {
            for (int j = blockCol; j < blockCol + 3; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }
        return true;
    }
}