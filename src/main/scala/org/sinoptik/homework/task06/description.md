# Домашнее задание
Настройка применения предобученной модели в Spark Streaming
## Цель:
Научимся обучать и сохранять модели Spark ML.
Научимся использовать предобученные модели Spark ML в Spark Streaming.
## Описание/Пошаговая инструкция выполнения домашнего задания:
1. Построить модель классификации Ирисов Фишера и сохранить её
Описание набора данных: https://ru.wikipedia.org/wiki/%D0%98%D1%80%D0%B8%D1%81%D1%8B_%D0%A4%D0%B8%D1%88%D0%B5%D1%80%D0%B0
Набор данных в формате CSV: https://www.kaggle.com/arshid/iris-flower-dataset
Набор данных в формате LIBSVM: https://github.com/apache/spark/blob/master/data/mllib/iris_libsvm.txt
Должен быть предоставлен код построения модели (ноутбук или программа)
2. Разработать приложение, которое читает из темы Kafka "input" CSV-записи с четырми признаками ирисов, и выводит на экран CSV-записи с теми же признаками и классов ириса.
Должен быть предоставлен код программы.
3. Дополнительное задание: вывод результатов в тему Kafka "predictition" вместо вывода на экран.
