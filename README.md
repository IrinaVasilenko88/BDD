[![Build status](https://ci.appveyor.com/api/projects/status/00m06smrrue0umct?svg=true)](https://ci.appveyor.com/project/IrinaVasilenko88/bdd)

# Обучение в Нетологии.

## Домашнее задание по курсу Автоматизированное тестирование

## Тема: Behaviour Driven Development

![](https://github.com/netology-code/aqa-homeworks/blob/aqa4/bdd/pic/cards.png)

![](https://github.com/netology-code/aqa-homeworks/blob/aqa4/bdd/pic/transfer.png)


 Реализация кастомных Steps на базе шаблона Akita, используя Page Object (приложение ```app-ibank-build-for-testers.jar```)

- Пусть пользователь залогинен с именем "vasya" и паролем "qwerty123";
- Когда он переводит "5 000" рублей с карты с номером "5559 0000 0000 0002" на свою "1" карту с главной страницы;
- Тогда баланс его "1" карты из списка на главной странице должен стать "15 000" рублей.

**Для запуска проекта:**
1. Склонировать проект из репозитория командой 

```
git clone https://github.com/IrinaVasilenko88/BDD.git
``` 
2. Открыть склонированный проект в Intellij IDEA
3. Открыть в терминале каталог ```artifacts```
4. Для запуска приложения ввести команду ```java -jar app-ibank-build-for-testers.jar```
5. Открыть файл ```BDD/src/test/resources/features/Логин и перевод средств с карты на карту.feature```
6. Перейти по шагам.
