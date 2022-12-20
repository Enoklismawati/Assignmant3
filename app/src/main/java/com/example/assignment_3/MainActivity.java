package com.example.assignment_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    TextView casesCount, recoveredCount, deathsCount;
    String cases;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        casesCount = findViewById(R.id.casesCount);
        recoveredCount = findViewById(R.id.recoveredCount);
        deathsCount = findViewById(R.id.deathsCount);

        Result result;

    }

    private void getCasesCount() {
        Call<List<Result>> call = RetrofitClient.getInstance().getMyApi().getCases();
        call.enqueue(new Callback<List<Result>>() {
            @Override
            public void onResponse(Call<List<Result>> call, Response<List<Result>> response) {
                List<Result> casesList = response.body();
                casesCount.setText(casesList.get(0).getCases());
                recoveredCount.setText(casesList.get(0).getRecovered());
                deathsCount.setText(casesList.get(0).getDeaths());
            }

            @Override
            public void onFailure(Call<List<Result>> call, Throwable t) {

            }
        });
    }
}