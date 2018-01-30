package ilyatkachev.github.com.gittest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //line 1 from master
        //feature 1
        //feature 3
        ////feature 2

        //beginning of rebase part
        //line 1 from feature for rebase
        //line 2 from feature for rebase
        //line 2 from master
        //end of rebasing

        //line before cherry pick
        //CherryPick line

        //CherryPick2 line
        //end of cherry pick (cherry pick 2 made with android studio instead of source tree)

        //beginning of rebase part 2
        //line 1 rebase 2
        //line 2 rebase 2
        //end of rebasing 2

        //stash line
        //new line from master for conflict

        //line from conflict brach

        //line1 from dev1
    }
}
