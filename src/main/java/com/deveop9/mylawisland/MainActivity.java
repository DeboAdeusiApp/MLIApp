package com.deveop9.mylawisland;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.widget.DrawerLayout;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity
        implements NavigationDrawerFragment.NavigationDrawerCallbacks {

    /**
     * Fragment managing the behaviors, interactions and presentation of the navigation drawer.
     */
    private NavigationDrawerFragment mNavigationDrawerFragment;

    /**
     * Used to store the last screen title. For use in {@link #restoreActionBar()}.
     */
    private CharSequence mTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNavigationDrawerFragment = (NavigationDrawerFragment)
                getSupportFragmentManager().findFragmentById(R.id.navigation_drawer);
        mTitle = getTitle();

        // Set up the drawer.
        mNavigationDrawerFragment.setUp(
                R.id.navigation_drawer,
                (DrawerLayout) findViewById(R.id.drawer_layout));
    }

    @Override
    public void onNavigationDrawerItemSelected(int position) {
        // update the main content by replacing fragments
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.container, PlaceholderFragment.newInstance(position + 1))
                .commit();
    }

    public void onSectionAttached(int number) {
        switch (number) {
            case 1:
                mTitle = getString(R.string.title_section1);
                break;
            case 2:
                mTitle = getString(R.string.title_section2);
                break;
            case 3:
                mTitle = getString(R.string.title_section3);
                break;
            case 4:
                mTitle = getString(R.string.title_section4);
                break;
            case 5:
                mTitle = getString(R.string.title_section5);
                break;
            case 6:
                mTitle = getString(R.string.title_section6);
                break;
            case 7:
                mTitle = getString(R.string.title_section7);
                break;
            case 8:
                mTitle = getString(R.string.title_section8);
                break;
        }
    }

    public void restoreActionBar() {
        ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.setTitle(mTitle);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if (!mNavigationDrawerFragment.isDrawerOpen()) {
            // Only show items in the action bar relevant to this screen
            // if the drawer is not showing. Otherwise, let the drawer
            // decide what to show in the action bar.
            getMenuInflater().inflate(R.menu.main, menu);
            restoreActionBar();
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            /**
             * this is where the section number is put into the fragment
             *okay
             */
            TextView textView = (TextView) rootView.findViewById(R.id.section_label);
            textView.setText(Integer.toString(getArguments().getInt(ARG_SECTION_NUMBER)));
            String sectionNumber = (Integer.toString(getArguments().getInt(ARG_SECTION_NUMBER)));

            String paraText = "para text unset";
            if (sectionNumber.equals("1")) {
                paraText = "Lorem ipsum dolor sit amet consectetur adipiscing elit"+
                        " consectetur adipiscing elit Integer nec odio"+
                        " Integer nec odio Praesent libero"+
                        " Praesent libero Sed cursus ante dapibus diam"+
                        " Sed cursus ante dapibus diam Sed nisi"+
                        " Sed nisi Nulla quis sem at nibh elementum imperdiet"+
                        " Nulla quis sem at nibh elementum imperdiet Duis sagittis ipsum"+
                        " Duis sagittis ipsum Praesent mauris"+
                        " Praesent mauris Fusce nec tellus sed augue semper porta"+
                        " Fusce nec tellus sed augue semper porta Mauris massa"+
                        " Mauris massa Vestibulum lacinia arcu eget nulla"+
                        " Vestibulum lacinia arcu eget nulla Class aptent taciti sociosqu ad litora torquent per conubia nostra"+
                        " Class aptent taciti sociosqu ad litora torquent per conubia nostra per inceptos himenaeos"+
                        " per inceptos himenaeos Curabitur sodales ligula in libero"+
                        " Curabitur sodales ligula in libero Sed dignissim lacinia nunc"+
                        " Sed dignissim lacinia nunc Curabitur tortor"+
                        " Curabitur tortor Pellentesque nibh"+
                        " Pellentesque nibh Aenean quam"+
                        " Aenean quam In scelerisque sem at dolor"+
                        " In scelerisque sem at dolor Maecenas mattis"+
                        " Maecenas mattis Sed convallis tristique sem"+
                        " Sed convallis tristique sem Proin ut ligula vel nunc egestas porttitor"+
                        " Proin ut ligula vel nunc egestas porttitor Morbi lectus risus"+
                        " Morbi lectus risus iaculis vel"+
                        " iaculis vel suscipit quis"+
                        " suscipit quis luctus non"+
                        " luctus non massa"+
                        " massa Fusce ac turpis quis ligula lacinia aliquet"+
                        " Fusce ac turpis quis ligula lacinia aliquet Mauris ipsum"+
                        " Mauris ipsum Nulla metus metus"+
                        " Nulla metus metus ullamcorper vel"+
                        " ullamcorper vel tincidunt sed"+
                        " tincidunt sed euismod in"+
                        " euismod in nibh"+
                        " nibh Quisque volutpat condimentum velit"+
                        " Quisque volutpat condimentum velit Class aptent taciti sociosqu ad litora torquent per conubia nostra"+
                        " Class aptent taciti sociosqu ad litora torquent per conubia nostra per inceptos himenaeos"+
                        " per inceptos himenaeos Nam nec ante"+
                        " Nam nec ante Sed lacinia"+
                        " Sed lacinia urna non tincidunt mattis"+
                        " urna non tincidunt mattis tortor neque adipiscing diam"+
                        " tortor neque adipiscing diam a cursus ipsum ante quis turpis"+
                        " a cursus ipsum ante quis turpis Nulla facilisi"+
                        " Nulla facilisi Ut fringilla"+
                        " Ut fringilla Suspendisse potenti"+
                        " Suspendisse potenti Nunc feugiat mi a tellus consequat imperdiet"+
                        " Nunc feugiat mi a tellus consequat imperdiet Vestibulum sapien"+
                        " Vestibulum sapien Proin quam"+
                        " Proin quam Etiam ultrices"+
                        " Etiam ultrices Suspendisse in justo eu magna luctus suscipit"+
                        " Suspendisse in justo eu magna luctus suscipit Sed lectus"+
                        " Sed lectus Integer euismod lacus luctus magna"+
                        " Integer euismod lacus luctus magna Quisque cursus"+
                        " Quisque cursus metus vitae pharetra auctor"+
                        " metus vitae pharetra auctor sem massa mattis sem"+
                        " sem massa mattis sem at interdum magna augue eget diam"+
                        " at interdum magna augue eget diam Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Morbi lacinia molestie dui"+
                        " Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Morbi lacinia molestie dui Praesent blandit dolor"+
                        " Praesent blandit dolor Sed non quam"+
                        " Sed non quam In vel mi sit amet augue congue elementum"+
                        " In vel mi sit amet augue congue elementum Morbi in ipsum sit amet pede facilisis laoreet"+
                        " Morbi in ipsum sit amet pede facilisis laoreet Donec lacus nunc"+
                        " Donec lacus nunc viverra nec"+
                        " viverra nec blandit vel"+
                        " blandit vel egestas et"+
                        " egestas et augue"+
                        " augue Vestibulum tincidunt malesuada tellus"+
                        " Vestibulum tincidunt malesuada tellus Ut ultrices ultrices enim"+
                        " Ut ultrices ultrices enim Curabitur sit amet mauris"+
                        " Curabitur sit amet mauris Morbi in dui quis est pulvinar ullamcorper"+
                        " Morbi in dui quis est pulvinar ullamcorper "
                ;

            } else if (sectionNumber.equals("2")) {
                paraText = "para text added for  2 ";

            } else if (sectionNumber.equals("3")) {
                paraText = "para text added for  3 ";

            } else if (sectionNumber.equals("4")) {
                paraText = "para text added for  4 ";

            } else if (sectionNumber.equals("5")) {
                paraText = "para text added for  5 ";

            } else if (sectionNumber.equals("6")) {
                paraText = "para text added for  6 ";

            } else if (sectionNumber.equals("7")) {
                paraText = "para text added for  7 ";

            } else if (sectionNumber.equals("8")) {
                paraText = "para text added for  8 ";

            }

            TextView editedText = (TextView) rootView.findViewById(R.id.para_bx);
            editedText.setText(paraText);
            return rootView;
        }

        @Override
        public void onAttach(Activity activity) {
            super.onAttach(activity);
            ((MainActivity) activity).onSectionAttached(
                    getArguments().getInt(ARG_SECTION_NUMBER));
        }
    }

}
