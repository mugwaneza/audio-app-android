package read.project.klab.readmytext;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Locale;


public class MainActivity extends Activity {

private DrawerLayout mDrawerLayout;
private ListView mDrawerList;
private ActionBarDrawerToggle mDrawerToggle;
private CharSequence mDrawerTitle;
private CharSequence mTitle;
private String[] mListTitles;


        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

            setContentView(R.layout.activity_main);

            mTitle = mDrawerTitle = getTitle();
            mListTitles = getResources().getStringArray(R.array.list_array);
            mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
            mDrawerList = (ListView) findViewById(R.id.left_drawer);

            // set a custom shadow that overlays the main content when the drawer opens
            mDrawerLayout.setDrawerShadow(R.drawable.drawer_shadow, GravityCompat.START);
            // set up the drawer's list view with saved_voice and click listener
            mDrawerList.setAdapter(new ArrayAdapter<String>(this,
                    R.layout.drawer_list_item, mListTitles));

            mDrawerList.setOnItemClickListener(new DrawerItemClickListener());

            // enable ActionBar app icon to behave as action to toggle nav drawer
            getActionBar().setDisplayHomeAsUpEnabled(true);
            getActionBar().setHomeButtonEnabled(true);

            // ActionBarDrawerToggle ties together the the proper interactions
            // between the sliding drawer and the action bar app icon
            mDrawerToggle = new ActionBarDrawerToggle(
                    this,                  /* host Activity */
                    mDrawerLayout,         /* DrawerLayout object */
                    R.drawable.ic_drawer,  /* nav drawer image to replace 'Up' caret */
                    R.string.drawer_open,  /* "open drawer" description for accessibility */
                    R.string.drawer_close  /* "close drawer" description for accessibility */
            ) {
                public void onDrawerClosed(View view) {
                    getActionBar().setTitle(mTitle);
                    invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
                }

                public void onDrawerOpened(View drawerView) {
                    getActionBar().setTitle(mDrawerTitle);
                    invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
                }
            };
            mDrawerLayout.setDrawerListener(mDrawerToggle);

            if (savedInstanceState == null) {
                selectItem(0);
            }
        }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            MenuInflater inflater = getMenuInflater();
            inflater.inflate(R.menu.menu_home, menu);
            return super.onCreateOptionsMenu(menu);
        }

        /* Called whenever we call invalidateOptionsMenu() */
        @Override
        public boolean onPrepareOptionsMenu(Menu menu) {
            // If the nav drawer is open, hide action saved_voice related to the content view
            boolean drawerOpen = mDrawerLayout.isDrawerOpen(mDrawerList);

            return super.onPrepareOptionsMenu(menu);
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            // Pass the event to ActionBarDrawerToggle, if it returns
            // true, then it has handled the app icon touch event
            if (mDrawerToggle.onOptionsItemSelected(item)) {
                return true;
            }
            // Handle your other action bar saved_voice...

            return super.onOptionsItemSelected(item);
        }


/* The click listner for ListView in the navigation drawer */
private class DrawerItemClickListener implements ListView.OnItemClickListener {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        selectItem(position);


    }
}


    private void selectItem(int position) {

        switch (position) {

                case 0:
                    // update the main content by replacing fragments
                    Fragment fragment0 = new HomeFragment();
                    Bundle args0 = new Bundle();

                    fragment0.setArguments(args0);

                    FragmentManager fragmentManager0 = getFragmentManager();
                    fragmentManager0.beginTransaction().replace(R.id.content_frame, fragment0).commit();

                    // update selected item and title, then close the drawer
                    mDrawerList.setItemChecked(position, true);
                    setTitle(mListTitles[position]);
                    mDrawerLayout.closeDrawer(mDrawerList);

                    break;

            case 1:

                // update the main content by replacing fragments
                Fragment fragment = new BankFragment();
                Bundle args = new Bundle();

                fragment.setArguments(args);

                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.content_frame, fragment).commit();

                // update selected item and title, then close the drawer
                mDrawerList.setItemChecked(position, true);
                setTitle(mListTitles[position]);
                mDrawerLayout.closeDrawer(mDrawerList);

                break;

            case 2:

                // update the main content by replacing fragments
                Fragment fragment1 = new TaxFragment();
                Bundle args1 = new Bundle();

                fragment1.setArguments(args1);

                FragmentManager fragmentManager1 = getFragmentManager();
                fragmentManager1.beginTransaction().replace(R.id.content_frame, fragment1).commit();

                // update selected item and title, then close the drawer
                mDrawerList.setItemChecked(position, true);
                setTitle(mListTitles[position]);
                mDrawerLayout.closeDrawer(mDrawerList);

                break;
             case 3:

                // update the main content by replacing fragments
                Fragment fragment3 = new ShopFragment();
                Bundle args3 = new Bundle();

                fragment3.setArguments(args3);

                FragmentManager fragmentManager3 = getFragmentManager();

                fragmentManager3.beginTransaction().replace(R.id.content_frame, fragment3).commit();

                // update selected item and title, then close the drawer
                mDrawerList.setItemChecked(position, true);
                setTitle(mListTitles[position]);
                mDrawerLayout.closeDrawer(mDrawerList);

                break;case 4:

                // update the main content by replacing fragments
                Fragment fragment4 = new HospitalFragment();
                Bundle args4 = new Bundle();

                fragment4.setArguments(args4);

                FragmentManager fragmentManager4 = getFragmentManager();

                fragmentManager4.beginTransaction().replace(R.id.content_frame, fragment4).commit();

                // update selected item and title, then close the drawer
                mDrawerList.setItemChecked(position, true);
                setTitle(mListTitles[position]);
                mDrawerLayout.closeDrawer(mDrawerList);

                break;
            case 5:

                // update the main content by replacing fragments
                Fragment fragment2 = new AboutFragment();
                Bundle args2 = new Bundle();

                fragment2.setArguments(args2);

                FragmentManager fragmentManager2 = getFragmentManager();

                fragmentManager2.beginTransaction().replace(R.id.content_frame, fragment2).commit();

                // update selected item and title, then close the drawer
                mDrawerList.setItemChecked(position, true);
                setTitle(mListTitles[position]);
                mDrawerLayout.closeDrawer(mDrawerList);

    break;
            default:
        }

    }

    @Override
    public void setTitle(CharSequence title) {
        mTitle = title;
        getActionBar().setTitle(mTitle);
    }

    /**
     * When using the ActionBarDrawerToggle, you must call it during
     * onPostCreate() and onConfigurationChanged()...
     */

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        // Sync the toggle state after onRestoreInstanceState has occurred.
        mDrawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        // Pass any configuration change to the drawer toggls
        mDrawerToggle.onConfigurationChanged(newConfig);
    }


/**
 * Fragment that appears in the "content_frame", shows a planet
 */
public static class AboutFragment extends Fragment {


    public AboutFragment() {
        // Empty constructor required for fragment subclasses
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.about_fragement, container, false);


        return rootView;
    }
}

public static class TaxFragment extends Fragment  {
    // Declare Variables
    ListView list;
    ListViewAdapter_Tax adapter;
    EditText editsearch;

    String[] listContent = {"Ndagenda",
            "Ndishyura angahe",
            "murakoze",
            "mwiriwe",
            "ndasigara hano",
            "ndatega tagisi",
            "ndatega moto",
            "oya"};

    ArrayList<WorldPopulation> arraylist = new ArrayList<WorldPopulation>();

    public TaxFragment() {
        // Empty constructor required for fragment subclasses
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.bank_fragment, container, false);


        list = (ListView)rootView.findViewById(R.id.listview);

        for (int i = 0; i < listContent.length; i++)
        {
            WorldPopulation wp = new WorldPopulation( listContent[i]);
            // Binds all strings into an array

            arraylist.add(wp);
        }

        // Pass results to ListViewAdapter Class
        adapter = new ListViewAdapter_Tax(getActivity(), arraylist);

        // Binds the Adapter to the ListView
        list.setAdapter(adapter);



        // Locate the EditText in listview_main.xml
        editsearch = (EditText)rootView.findViewById(R.id.search);

        // Capture Text in EditText
        editsearch.addTextChangedListener(new TextWatcher() {

            @Override
            public void afterTextChanged(Editable arg0) {
                // TODO Auto-generated method stub
                String text = editsearch.getText().toString().toLowerCase(Locale.getDefault());

                adapter.filter(text);

            }

            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1,
                                          int arg2, int arg3) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onTextChanged(CharSequence arg0, int arg1, int arg2,
                                      int arg3) {



                // TODO Auto-generated method stub
            }
        });


        return rootView;
    }

}

public class BankFragment extends Fragment {
    // Declare Variables
    ListView list;
    ListViewAdapter_Bank adapter;
    EditText editsearch;

    String[] listContent = {"kubikuza",
            "kubitsa",
            "murakoze",
            "mwiriwe",
            "ndasaba inguzanyo",
            "nta konegisiyo ihari ?",
            "oya",
            "yego"};

    ArrayList<WorldPopulation> arraylist = new ArrayList<WorldPopulation>();

    public BankFragment() {
        // Empty constructor required for fragment subclasses
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.bank_fragment, container, false);


        list = (ListView) rootView.findViewById(R.id.listview);

        for (int i = 0; i < listContent.length; i++) {
            WorldPopulation wp = new WorldPopulation(listContent[i]);
            // Binds all strings into an array

            arraylist.add(wp);
        }

        // Pass results to ListViewAdapter Class
        adapter = new ListViewAdapter_Bank(getActivity(), arraylist);

        // Binds the Adapter to the ListView
        list.setAdapter(adapter);


        // Locate the EditText in listview_main.xml
        editsearch = (EditText) rootView.findViewById(R.id.search);

        // Capture Text in EditText
        editsearch.addTextChangedListener(new TextWatcher() {

            @Override
            public void afterTextChanged(Editable arg0) {
                // TODO Auto-generated method stub
                String text = editsearch.getText().toString().toLowerCase(Locale.getDefault());

                adapter.filter(text);

            }

            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1,
                                          int arg2, int arg3) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onTextChanged(CharSequence arg0, int arg1, int arg2,
                                      int arg3) {



                // TODO Auto-generated method stub
            }
        });
        return rootView;
    }
}


    public class HomeFragment extends Fragment {


        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            final View rootView = inflater.inflate(R.layout.home_fragment, container, false);
            return rootView;
        }
    }

            public class ShopFragment extends Fragment {
        // Declare Variables
        ListView list;
        ListViewAdapter_Shop adapter;
        EditText editsearch;

        String[] listContent = {
                "mwiriwe",
                "urashaka iki",
                "ndishyura angahe",
                "mungarurire",
                "oya",
                "yego",
                "murakoze"};

        ArrayList<WorldPopulation> arraylist = new ArrayList<WorldPopulation>();

        public ShopFragment() {
            // Empty constructor required for fragment subclasses
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            final View rootView = inflater.inflate(R.layout.bank_fragment, container, false);


            list = (ListView)rootView.findViewById(R.id.listview);

            for (int i = 0; i < listContent.length; i++)
            {
                WorldPopulation wp = new WorldPopulation( listContent[i]);
                // Binds all strings into an array

                arraylist.add(wp);
            }

            // Pass results to ListViewAdapter Class
            adapter = new ListViewAdapter_Shop(getActivity(), arraylist);

            // Binds the Adapter to the ListView
            list.setAdapter(adapter);


            // Locate the EditText in listview_main.xml
            editsearch = (EditText)rootView.findViewById(R.id.search);

            // Capture Text in EditText
            editsearch.addTextChangedListener(new TextWatcher() {

                @Override
                public void afterTextChanged(Editable arg0) {
                    // TODO Auto-generated method stub
                    String text = editsearch.getText().toString().toLowerCase(Locale.getDefault());

                    adapter.filter(text);

                }

                @Override
                public void beforeTextChanged(CharSequence arg0, int arg1,
                                              int arg2, int arg3) {
                    // TODO Auto-generated method stub
                }

                @Override
                public void onTextChanged(CharSequence arg0, int arg1, int arg2,
                                          int arg3) {



                    // TODO Auto-generated method stub
                }
            });
            return rootView;
        }


    }



    public class HospitalFragment extends Fragment {
        // Declare Variables
        ListView list;
        ListViewAdapter_Hospital adapter;
        EditText editsearch;

        String[] listContent = {"ndarwaye",
                "ndaribwa hano",
                "murakoze",
                "mwiriwe",
                "oya",
                "navunitse hano",
                "sinabibasha",
                "yego"

        };

        ArrayList<WorldPopulation> arraylist = new ArrayList<WorldPopulation>();

        public HospitalFragment() {
            // Empty constructor required for fragment subclasses
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            final View rootView = inflater.inflate(R.layout.bank_fragment, container, false);


            list = (ListView)rootView.findViewById(R.id.listview);

            for (int i = 0; i < listContent.length; i++)
            {
                WorldPopulation wp = new WorldPopulation( listContent[i]);
                // Binds all strings into an array

                arraylist.add(wp);
            }

            // Pass results to ListViewAdapter Class
            adapter = new ListViewAdapter_Hospital(getActivity(), arraylist);

            // Binds the Adapter to the ListView
            list.setAdapter(adapter);



            // Locate the EditText in listview_main.xml
            editsearch = (EditText)rootView.findViewById(R.id.search);

            // Capture Text in EditText
            editsearch.addTextChangedListener(new TextWatcher() {

                @Override
                public void afterTextChanged(Editable arg0) {
                    // TODO Auto-generated method stub
                    String text = editsearch.getText().toString().toLowerCase(Locale.getDefault());

                    adapter.filter(text);

                }

                @Override
                public void beforeTextChanged(CharSequence arg0, int arg1,
                                              int arg2, int arg3) {
                    // TODO Auto-generated method stub
                }

                @Override
                public void onTextChanged(CharSequence arg0, int arg1, int arg2,
                                          int arg3) {


                    // TODO Auto-generated method stub
                }
            });
            return rootView;
        }


    }
    }






