package rezaberlian_id.sch.smktelkom_mlg.learn.parsingvariabel_resa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class Main2Activity extends AppCompatActivity {
    TextView txtNama,txtTahun,txtAlamat,txtTelepon,txtEmail;
    String get_nama, get_alamat, get_email, get_tahun, get_telepon;

        @Override

        protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_main2);

            txtNama = (TextView)findViewById(R.id.txtNama);
            txtTahun = (TextView)findViewById(R.id.txtTahun);
            txtAlamat = (TextView)findViewById(R.id.txtAlamat);
            txtTelepon =(TextView)findViewById(R.id.txtTelepon);
            txtEmail= (TextView)findViewById(R.id.txtEmail);

            Bundle b = getIntent().getExtras();
            get_nama = b.getString("parse_nama");
            get_tahun = b.getString("parse_tahun");
            get_alamat = b.getString("parse_alamat");
            get_telepon= b.getString("parse_telepon");
            get_email = b.getString("parse_email");

            txtNama.setText("Nama Anda adalah "+get_nama);
            txtTahun.setText("Tahun lahir Anda "+ get_tahun);
            txtAlamat.setText("Alamat Anda adalah "+get_alamat);
            txtTelepon.setText("No Telephon  " + get_telepon);
            txtEmail.setText("Alamat email Anda adalah " + get_email);

        }
    }


