package Conectar;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;


public class Fecha {
    private Timer timer;
    private List<Listener> listeners = new ArrayList<>();

    public Fecha() {
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                LocalTime horaActual = LocalTime.now();
                notifyListeners(horaActual);
            }
        }, 0, 1000); // Actualizar cada segundo
    }

    public void addListener(Listener listener) {
        listeners.add(listener);
    }

    private void notifyListeners(LocalTime hora) {
        for (Listener listener : listeners) {
            listener.update(hora);
        }
    }

    public void detener() {
        timer.cancel();
    }

    public interface Listener {
        void update(LocalTime hora);
    }

}

