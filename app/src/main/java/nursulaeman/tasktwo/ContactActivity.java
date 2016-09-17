package nursulaeman.tasktwo;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ContactActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("Address"));
        tabLayout.addTab(tabLayout.newTab().setText("Phone"));
        tabLayout.addTab(tabLayout.newTab().setText("Other"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

    }
}
