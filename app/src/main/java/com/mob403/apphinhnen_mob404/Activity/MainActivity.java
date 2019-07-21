package com.mob403.apphinhnen_mob404.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.mob403.apphinhnen_mob404.Api.Api;
import com.mob403.apphinhnen_mob404.Api.WallpaperSevice;
import com.mob403.apphinhnen_mob404.Models.Photo;
import com.mob403.apphinhnen_mob404.R;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getPhoto();
    }
    private void getPhoto() {
        WallpaperSevice apiInterface = Api.createService(WallpaperSevice.class);
        Call<List<Photo>> call = apiInterface.getPhotos();
        call.enqueue(new Callback<List<Photo>>() {
            @Override
            public void onResponse(@NotNull Call<List<Photo>> call, @NotNull Response<List<Photo>> response) {
                if (response.isSuccessful()) {
                    Log.e(TAG, "Loading successfully, size: " + response.body().size());
                }
            }
            @Override
            public void onFailure(Call<List<Photo>> call, Throwable t) {
                Log.e(TAG, t.getMessage());
            }
        });
    }
}
