[![Build status](https://ci.appveyor.com/api/projects/status/00m06smrrue0umct?svg=true)](https://ci.appveyor.com/project/IrinaVasilenko88/bdd)

# Обучение в Нетологии.

## Домашнее задание по курсу Автоматизированное тестирование

## Тема: Behaviour Driven Development

 Реализация кастомных Steps на базе шаблона Akita, используя Page Object (приложение ```app-ibank-build-for-testers.jar```)

- Пусть пользователь залогинен с именем "vasya" и паролем "qwerty123";
- Когда он переводит "5 000" рублей с карты с номером "5559 0000 0000 0002" на свою "1" карту с главной страницы;
- Тогда баланс его "1" карты из списка на главной странице должен стать "15 000" рублей.
