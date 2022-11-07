kafka-topics --bootstrap-server kafka:9092 --list
kafka-topics --bootstrap-server kafka:9092 --create --partitions 1 --replication-factor 1 --topic test