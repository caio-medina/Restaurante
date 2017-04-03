package a2016_2.pooa.iff.br.restaurante.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import a2016_2.pooa.iff.br.restaurante.R;

public class Cardapio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardapio);
    }

    public void chamaTelaPedido(View v) {
        Toast.makeText(this, "Botão funcionando", Toast.LENGTH_SHORT);

        Intent intent = new Intent(Cardapio.this, Pedido.class);
        startActivity(intent);
    }
}
