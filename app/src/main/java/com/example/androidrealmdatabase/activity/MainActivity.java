package com.example.androidrealmdatabase.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.androidrealmdatabase.R;
import com.example.androidrealmdatabase.model.Person;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.realm.Realm;
import io.realm.RealmResults;

public class MainActivity extends AppCompatActivity {

    Realm mRealm;
    public EditText getPersonNid, getPersonName, getPersonAge, getLanguage;
    public Button btnCreate, btnRead, btnUpdate, btnDeleteByName;
    public TextView viewPerson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ButterKnife.bind(this);

        mRealm = Realm.getDefaultInstance();


    }

    private void initViews(){

        getPersonNid = (EditText) findViewById(R.id.person_nid);
        getPersonName = (EditText) findViewById(R.id.person_name);
        getPersonAge = (EditText) findViewById(R.id.person_age);
        getLanguage = (EditText) findViewById(R.id.language_name);
        btnCreate = (Button) findViewById(R.id.btn_create);
        btnRead = (Button) findViewById(R.id.btn_read);
        btnUpdate = (Button) findViewById(R.id.btn_update);
        btnDeleteByName = (Button) findViewById(R.id.btn_deletebyname);
        viewPerson = (TextView) findViewById(R.id.view_person);


    }

//    private void createPerson(){
//
//    }
//
//    private void readPerson(){
//
//        mRealm.executeTransaction(new Realm.Transaction() {
//            @Override
//            public void execute(Realm realm) {
//                RealmResults<Person> results =
//                        realm.where(Person.class).findAll();
//
//                viewPerson.setText("");
//
//                for(Person person: results){
//
//                    long randomNID = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
//
//                    viewPerson.append("NID: " + randomNID + "\n"
//                        + "Name: " + person.name + "\n"
//                        + "Age: " + person.age + "\n"
//                        + "Language Count: " + person.languages.size());
//                }
//
//            }
//        });
//
//    }
//
//    private void updatePerson(){
//
//    }
//
//    private void deleteByName(){
//
//
//    }
//
//
//
//
//
//


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mRealm != null) {
            mRealm.close();
        }
    }
}
