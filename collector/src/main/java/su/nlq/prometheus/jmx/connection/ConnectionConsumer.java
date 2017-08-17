package su.nlq.prometheus.jmx.connection;

import org.jetbrains.annotations.NotNull;

import javax.management.MBeanServerConnection;

public interface ConnectionConsumer {

  void accept(@NotNull String address, @NotNull MBeanServerConnection connection);
}
