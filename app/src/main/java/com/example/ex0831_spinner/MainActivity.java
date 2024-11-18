package com.example.ex0831_spinner;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    TextView tVname, tVfName, tVdate, tVphone_n;
    ListView listV;
    Spinner spin;

    String[] classes = {"Class 1", "Class 2", "Class 3", "Class 4"}

    String[] class1_name = {
            "Aiden Thomas", "Grace Harris", "Jackson Lee", "Lily Scott", "Daniel Carter",
            "Mia Bennett", "Jacob Wright", "Zoe Mitchell", "Lucas King", "Emma Parker"
    };
    String[] class2_name = {
            "Olivia Walker", "Ryan Adams", "Sophia Young", "Ethan Miller", "Chloe Garcia",
            "William Nelson", "Isabella Hall", "Benjamin Moore", "Harper Robinson", "Samuel Green"
    };
    String[] class3_name = {
            "Emily Scott", "Noah Anderson", "Ava White", "Jack Taylor", "Ella Lewis",
            "Liam Clark", "Madison Harris", "Oliver Collins", "Scarlett King", "Logan Davis"
    };
    String[] class4_name = {
            "Amelia Martinez", "Elijah Brown", "Lucas Johnson", "Charlotte Turner", "Matthew Green",
            "Victoria Hall", "Samuel Rodriguez", "Zoe Lee", "Harrison Wright", "Aria Taylor"
    };

    // all info
    String[][] class1 = {
            {"Thomas", "Aiden", "15/02/2006", "050-1234567"},
            {"Harris", "Grace", "22/07/2005", "052-2345678"},
            {"Lee", "Jackson", "10/11/2006", "053-3456789"},
            {"Scott", "Lily", "05/03/2007", "054-4567890"},
            {"Carter", "Daniel", "30/09/2005", "055-5678901"},
            {"Bennett", "Mia", "11/06/2006", "050-6789012"},
            {"Wright", "Jacob", "25/12/2006", "052-7890123"},
            {"Mitchell", "Zoe", "03/08/2005", "053-8901234"},
            {"King", "Lucas", "20/04/2007", "054-9012345"},
            {"Parker", "Emma", "17/01/2006", "055-0123456"}
    };
    String[][] class2 = {
            {"Walker", "Olivia", "14/02/2006", "050-1234567"},
            {"Adams", "Ryan", "20/06/2005", "052-2345678"},
            {"Young", "Sophia", "05/03/2006", "053-3456789"},
            {"Miller", "Ethan", "12/11/2005", "054-4567890"},
            {"Garcia", "Chloe", "18/10/2006", "055-5678901"},
            {"Nelson", "William", "01/04/2007", "050-6789012"},
            {"Hall", "Isabella", "08/09/2006", "052-7890123"},
            {"Moore", "Benjamin", "15/07/2005", "053-8901234"},
            {"Robinson", "Harper", "21/05/2007", "054-9012345"},
            {"Green", "Samuel", "30/12/2005", "055-0123456"}
    };
    String[][] class3 = {
            {"Scott", "Emily", "17/02/2006", "050-1234567"},
            {"Anderson", "Noah", "12/01/2005", "052-2345678"},
            {"White", "Ava", "04/10/2006", "053-3456789"},
            {"Taylor", "Jack", "23/03/2006", "054-4567890"},
            {"Lewis", "Ella", "07/05/2005", "055-5678901"},
            {"Clark", "Liam", "19/11/2006", "050-6789012"},
            {"Harris", "Madison", "26/07/2007", "052-7890123"},
            {"Collins", "Oliver", "11/04/2006", "053-8901234"},
            {"King", "Scarlett", "28/06/2005", "054-9012345"},
            {"Davis", "Logan", "15/09/2006", "055-0123456"}
    };
    String[][] class4 = {
            {"Martinez", "Amelia", "22/02/2006", "050-1234567"},
            {"Brown", "Elijah", "30/11/2005", "052-2345678"},
            {"Johnson", "Lucas", "12/05/2007", "053-3456789"},
            {"Turner", "Charlotte", "21/01/2006", "054-4567890"},
            {"Green", "Matthew", "03/12/2005", "055-5678901"},
            {"Hall", "Victoria", "29/07/2006", "050-6789012"},
            {"Rodriguez", "Samuel", "18/04/2007", "052-7890123"},
            {"Lee", "Zoe", "09/08/2005", "053-8901234"},
            {"Wright", "Harrison", "14/06/2006", "054-9012345"},
            {"Taylor", "Aria", "01/03/2007", "055-0123456"}
    };

    ArrayAdapter<String> adp_listV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tVname = findViewById(R.id.tVname);
        tVfName = findViewById(R.id.tVfName);
        tVdate = findViewById(R.id.tVdate);
        tVphone_n = findViewById(R.id.tVphone_n);

        listV = findViewById(R.id.lV);
        spin = findViewById(R.id.spin);

        // list view context:
        listV.setOnItemClickListener(this);
        listV.setChoiceMode(ListView.CHOICE_MODE_SINGLE);


        /*

         */

        ArrayAdapter<String> adp_spin = new ArrayAdapter<String>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, classes);
        spin.setAdapter(adp_spin);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        listV.setOnItemClickListener(this);
        listV.setChoiceMode (ListView.CHOICE_MODE_SINGLE);

        if(position == 0)
        {
            adp_listV = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, class1_name);
        }
        else if(position == 1)
        {
            adp_listV = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, class2_name);
        }
        else if(position == 2)
        {
            adp_listV = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, class3_name);
        }
        else
        {
            adp_listV = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, class4_name);
        }

        listV.setAdapter(adp_listV);
    }
}