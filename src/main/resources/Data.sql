INSERT INTO category (ID, NAME)
VALUES(1, 'lesson'),
(2,'exercice'),
(3, 'adjectif-ni'),
(4, 'adjectif-na'),
(5, 'verbe'),
(6, 'nombre'),
(7, 'dialogue'),
(8, 'son'),
(9,'image'),
(10, 'nom'),
(11,'mois'),
(12,'jour du mois');

INSERT INTO asset (ID, ASSET_ORDER,VALUE)
VALUES(1, 1, 1);

INSERT INTO theme (ID, NAME, DESCRIPTION)
VALUES(1, 'Vocabulaire', 'vocabulaire'),
(2, 'Grammaire', 'Grammaire'),
(3, 'Dialogue', 'Dialogue');


INSERT INTO exercise (ID, QUESTION_ASSET_ITEM, GOOD_QUESTION_ITEM, ANSWER_QUESTION_ITEM1, ANSWER_QUESTION_ITEM2, ANSWER_QUESTION_ITEM3, EXERCISE_ORDER)
VALUES(1, '学校_どこ？', 'は','それ','も','が', 1),
(2, 'これ_何？','は','も','どれ','が', 2),
(3, 'ここ_図書館だ', 'が','どれ','も','は', 3);
/*(4, 'Forme déclarative', 'これだ', 4),
(5, 'Forme déclarative', 'これだ','', 5),
(6, 'Forme déclarative', 'これだ','', 6);*/

INSERT INTO vocabulary(ID, NAME, ROMAJI,  exercise_id)
VALUES(1, '家','ie', 1);

INSERT INTO number(ID, NAME,ROMAJI, exercise_id)
VALUES(1, '一つ','hitotsu', 1);


INSERT INTO lesson (ID, NAME)
VALUES(1,'Introduction aux particules （は、も、が)'),
(2, 'La forme pour exprimer le potentiel'),
(3,'Exprimer différents niveaux de certitude');

INSERT INTO chapter(ID,TITLE, TEXT, EXEMPLE, lesson_id )
VALUES(1,'Définir les fonctions grammaticales avec les particules','Nous allons maintenant faire bon usage de ce que nous venons d&apos;apprendre en associant un nom à un autre nom.
Ceci peut être réalisé à l&apos;aide de ce que l&apos;on appelle des particules.
Les particules, formées de un ou deux caractères hiragana, s&apos;ajoutent à la fin d&apos;un mot pour définir quelle fonction grammaticale il remplit dans la phrase.
Employer les bonnes particules est très important car la signification d&apos;une phrase peut en être radicalement changé.
Par exemple, la phrase "manger du poisson." peut devenir "le poisson mange." simplement en changeant une particule.', null, 1 ),
(2, 'La particule de thème 「は', 'La première particule que nous apprendrons est la particule de thème.
La particule de thème permet de montrer de quoi vous êtes en train de parler ou plus simplement, le thème de la phrase. Par exemple, une personne nous dit : "pas étudiant."
Bien que nous n&apos;ayons pas beaucoup d&apos;informations supplémentaires sur cette phrase à cause du manque de connaissance de son contexte, cette phrase sera parfaitement correcte en japonais.
Cette particule nous permet donc d&apos;exprimer de quoi notre phrase va parler. La particule de thème utilise le caractère 「は」, mais bien que ce caractère soit normalement prononcé / ha /, il est uniquement prononcé / wa / lorsqu&apos;il est employé comme particule de thème.
Dans cet exemple, Bob indique que sa question concerne Alice. On remarquera que malgré le fait que 「だ」 n&apos;ait pas été employé, la traduction française utilise tout de même le verbe être : "es" et "suis".
De plus, comme nous savons que le thème de la question est Alice, nous n&apos;avons besoin de rien d&apos;autre pour deviner qu&apos;Alice est une étudiante.
En fait, puisque Bob pose une question, il ne peut pas ajouter 「だ」 car dans ce cas, il affirmerait une chose tout en posant une question dessus.', 'ボブ：　アリスは学生？- Alice, es-tu étudiante?
アリス：　うん、学生。- Ouais, je le suis.', 1),
(3, 'La particule inclusive de thème 「も','C&apos;est une particule qui est très semblable à la particule de thème.
Elle a le sens additionnel d&apos;"aussi".
Elle peut ainsi introduire un autre thème en plus du thème courant. La caractère 「も」 est utilisé pour désigner la particule inclusive. Voici des exemples pour mieux comprendre son utilisation.
Notez qu&apos;Alice doit être inclue. Cela n’aurait aucun sens de dire, "je suis étudiante, et Jim n&apos;est également pas un étudiant."
Sinon, Alice emploierait la particule は pour retirer la signification additionnelle comme dans le prochain exemple.','ボブ：　アリスは学生？- Alice, es-tu étudiante?
アリス：　うん、トムも学生。- Ouais, et Tom l&apos;est aussi étudiant.ボブ：　アリスは学生？- Alice, es-tu étudiante?
アリス：　うん、でもトムは学生じゃない。- Ouais, mais Tom n&apos;est pas étudiant.ボブ：　アリスは学生？- Alice, es-tu étudiante?
アリス：　ううん、トムも学生じゃない。- Non, et Tom n&apos;est pas étudiant non plus.',1 ),
(4, 'Exprimer la capacité de faire quelque chose', 'En japonais, la capacité de faire certaines actions est exprimée en conjugant le verbe plutôt qu&apos;en ajoutant un mot comme en français "pouvoir" ou "être capable".
Tous les verbes, une fois conjugués dans leur forme potentielle, deviennent un verbe-ru.', null, 2),
(5, 'La forme potentielle', 'Encore une fois, les règles peuvent se diviser en deux groupes principaux : les verbes-ru et les verbes-u.
La forme potentielle du verbe 「する」 (qui veut dire "faire") est un cas spécial car il devient un tout autre verbe : 「できる」 （出来る.
Certains ajouterons parfois 「れる」 à la place de 「られる」 pour les verbes-ru. Par exemple, 「食べる」 devient 「食べれる」 à la place de 「食べられる」.
Je vous suggère d&apos;étudier la conjugaison officelle d&apos;abord car la paresse est une habitude difficile difficile à casser et que la version courte, bien que commune, n&apos;est pas techniquement correcte.'
,'verbes-ru - Remplacer le 「る」 par 「られる」.
（例）　見る → 見られる
verbes-u - Changer le dernier caractère d&apos;une voyelle / u / en son équivalent / e / et ajouter 「る」.
（例）　遊ぶ → 遊べ → 遊べる
Exceptions - 「する」 devient 「できる」 et 「くる」 devient 「こられる」. 漢字は書けますか？- Peux-tu écrire des Kanji?
残念だが、今週末は行けない。- Malheureusement, je ne peux pas aller ce week-end.
もう信じられない。- Déjà ? Je ne peux le croire.',2) ;

/*
INSERT INTO chapter_exercise (chapter_id, exercise_id)
VALUES(1,1),
(2,2);
*/

INSERT INTO level (ID, NAME)
VALUES(1, 'Debutant'),
(2, 'Intermediaire'),
(3, 'Avancé');



