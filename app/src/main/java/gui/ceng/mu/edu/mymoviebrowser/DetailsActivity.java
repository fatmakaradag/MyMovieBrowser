package gui.ceng.mu.edu.mymoviebrowser;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Movie movie = getIntent().getParcelableExtra("movie");

        FragmentTransaction fts = getSupportFragmentManager().beginTransaction();
        fts.add(R.id.container,  DetailsFragment.newInstance(movie));
        fts.commit();
    }
}