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
VALUES(1, 'ie', 'maison','pantalon','chiffre','soleil', 1);
/*(2, 'Forme déclarative', 'これだ','', 2),
(3, 'Forme déclarative', 'これだ','', 3),
(4, 'Forme déclarative', 'これだ','', 4),
(5, 'Forme déclarative', 'これだ','', 5),
(6, 'Forme déclarative', 'これだ','', 6),
(7, 'Forme déclarative', 'これだ','', 7),
(8, 'Forme déclarative', 'これだ','', 8),
(9, 'Forme déclarative', 'これだ','', 9),
(10,'Forme déclarative', 'これだ','', 10),
(11,'Forme déclarative', 'これだ','', 11),
(12,'Forme déclarative', 'これだ','', 12),
(13,'Forme déclarative', 'これだ','', 13),
(14,'Forme déclarative', 'これだ','', 14),
(15,'Forme déclarative', 'これだ','', 15);*/

INSERT INTO vocabulary(ID, NAME, ROMAJI,  exercise_id)
VALUES(1, '家','ie', 1);

INSERT INTO nomber(ID, NAME,ROMAJI, exercise_id)
VALUES(1, '一つ','hitotsu', 1);

INSERT INTO nomber_category(nomber_id, category_id)
VALUES(1,6);


INSERT INTO cours (ID, NAME, sub_title, TITLE, TEXT, EXEMPLE)
VALUES(1,'Introduction aux particules （は、も、が)','chapitre 1','Définir les fonctions grammaticales avec les particules','Nous allons maintenant faire bon usage de ce que nous venons d\apprendre en associant un nom à un autre nom.
Ceci peut être réalisé à l\aide de ce que l\on appelle des particules.
Les particules, formées de un ou deux caractères hiragana, s\ajoutent à la fin d\un mot pour définir quelle fonction grammaticale il remplit dans la phrase.
Employer les bonnes particules est très important car la signification d\une phrase peut en être radicalement changé. Par exemple, la phrase "manger du poisson." peut devenir "le poisson mange." simplement en changeant une particule.
',null);

/*(2, 'La forme pour exprimer le potentiel'),
(3,'Exprimer différents niveaux de certitude');*/


INSERT INTO level (ID, NAME)
VALUES(1, 'Debutant'),
(2, 'Intermediaire'),
(3, 'Avancé');



