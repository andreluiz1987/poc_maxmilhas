package developers.com.br.poc_maxmilhas.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import developers.com.br.poc_maxmilhas.Helpers.MessageHelpers;
import developers.com.br.poc_maxmilhas.R;
import developers.com.br.poc_maxmilhas.model.FlightSearch;
import developers.com.br.poc_maxmilhas.sync.SynchronizeFlight;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.txt_iata_origin)
    TextView txtIATAOrigin;
    @BindView(R.id.txt_iata_destination)
    TextView txtIATADestination;
    @BindView(R.id.txt_date_initial)
    TextView txtDateInitial;
    @BindView(R.id.txt_date_return)
    TextView txtDateReturn;
    @BindView(R.id.txt_passenger)
    TextView txtPassenger;
    @BindView(R.id.btn_search_ticket)
    Button btnSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_search_ticket)
    public void SearchTicket() {

        if (txtIATAOrigin.length() == 0) {
            MessageHelpers.Alert(this, getString(R.string.title_alert), getString(R.string.iata_origin_empty));
        } else if (txtIATADestination.length() == 0) {
            MessageHelpers.Alert(this, getString(R.string.title_alert), getString(R.string.iata_destination_empty));
        } else if (txtDateInitial.length() == 0) {
            MessageHelpers.Alert(this, getString(R.string.title_alert), getString(R.string.passenger_empty));
        } else {

            FlightSearch flightSearch = new FlightSearch();

            flightSearch.setOrigin(txtIATAOrigin.getText().toString());
            flightSearch.setDestination(txtIATADestination.getText().toString());
            flightSearch.setDateDeparture(txtDateInitial.getText().toString());
            flightSearch.setDateArrival(txtDateReturn.getText().toString());
            flightSearch.setNumberPassenger(txtPassenger.getText().toString());

            SynchronizeFlight sf = new SynchronizeFlight();
            sf.getFligths(flightSearch);
        }
    }
}
