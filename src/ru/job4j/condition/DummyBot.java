package ru.job4j.condition;

    public class DummyBot {
        public static String answer(String question) {
            String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
            if ("Привет, Бот.".equals(question)) {
                /* заменить ... на правильный ответ rsl = "ответ по заданию". */
                rsl = "Привет, умник.";
            } else if (question.equals("Пока.")) {
                rsl = "До скорой встречи.";
            }
            return rsl;
        }

        public static void main(String[] args) {
            String rsl = ru.job4j.condition.DummyBot.answer("Привет, Бот.");
            System.out.println(rsl);
            rsl = ru.job4j.condition.DummyBot.answer("Пока.");
            System.out.println(rsl);
            rsl = ru.job4j.condition.DummyBot.answer("Что нового?");
            System.out.println(rsl);
        }
    }
