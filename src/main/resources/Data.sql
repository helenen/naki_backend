INSERT INTO category (NAME)
VALUES('lesson'),
('exercice'),
('adjectif-ni'),
('adjectif-na'),
('verbe'),
('nombre'),
('dialogue'),
('son'),
('image'),
('nom'),
('mois'),
('jour du mois');




INSERT INTO exercise (QUESTION_ASSET_ITEM, GOOD_QUESTION_ITEM, ANSWER_QUESTION_ITEM1, ANSWER_QUESTION_ITEM2, ANSWER_QUESTION_ITEM3, EXERCISE_ORDER)
VALUES('学校_どこ？', 'は','それ','も','が', 1),
('これ_何？','は','も','どれ','が', 2),
('ここ_図書館だ', 'が','どれ','も','は', 3);
/*(4, 'Forme déclarative', 'これだ', 4),
(5, 'Forme déclarative', 'これだ','', 5),
(6, 'Forme déclarative', 'これだ','', 6);*/

INSERT INTO vocabulary(NAME, ROMAJI,  exercise_id)
VALUES('家','ie', 1);

INSERT INTO number(NAME,ROMAJI, exercise_id)
VALUES('一つ','hitotsu', 1),
('二つ','hitotsu', 2);

INSERT INTO level (NAME)
VALUES('Debutant'),
('Intermediaire'),
('Avancé');

INSERT INTO lesson (NAME, level_id)
VALUES('Introduction aux particules （は、も、が)', 1),
('La forme pour exprimer le potentiel', 2),
('Exprimer différents niveaux de certitude', 3),
('poulou1', 1),
('poulou2',2),
('poulou3',3);

INSERT INTO chapter(TITLE,lesson_id)
VALUES('Définir les fonctions grammaticales avec les particules',1),
('La particule de thème 「は',1),
('Exprimer la capacité de faire quelque chose',2),
('La forme potentielle',2),
('Les formes potentielles n ont pas d objet',2),
('Est-ce que 「見える」 and 「聞こえる」 sont des exceptions?',2),
('Exprimer différents degrés de certitude',3),
('Exprimer 「かもしれない」 pour exprimer l’incertitude',3),
('Utiliser 「でしょう」 pour exprimer une faible certitude (poli)',3);

INSERT INTO text(TEXT, EXEMPLE, chapter_id)
VALUES('Nous allons maintenant faire bon usage de ce que nous venons d apprendre en associant un nom à un autre nom.
Ceci peut être réalisé à l aide de ce que l on appelle des particules.
Les particules, formées de un ou deux caractères hiragana, s ajoutent à la fin d un mot pour définir quelle fonction grammaticale il remplit dans la phrase.
Employer les bonnes particules est très important car la signification d une phrase peut en être radicalement changé.
Par exemple, la phrase "manger du poisson." peut devenir "le poisson mange." simplement en changeant une particule.', null,1),
('La première particule que nous apprendrons est la particule de thème.
La particule de thème permet de montrer de quoi vous êtes en train de parler ou plus simplement, le thème de la phrase. Par exemple, une personne nous dit : "pas étudiant."
Bien que nous n ayons pas beaucoup d informations supplémentaires sur cette phrase à cause du manque de connaissance de son contexte, cette phrase sera parfaitement correcte en japonais.
Cette particule nous permet donc d exprimer de quoi notre phrase va parler. La particule de thème utilise le caractère 「は」, mais bien que ce caractère soit normalement prononcé / ha /, il est uniquement prononcé / wa / lorsqu il est employé comme particule de thème.',
'ボブ：　アリスは学生？- Alice, es-tu étudiante?
アリス：　うん、学生。- Ouais, je le suis.', 2),
('Dans cet exemple, Bob indique que sa question concerne Alice. On remarquera que malgré le fait que 「だ」 nait pas été employé, la traduction française utilise tout de même le verbe être : es et suis.
De plus, comme nous savons que le thème de la question est Alice, nous navons besoin de rien dautre pour deviner quAlice est une étudiante.
En fait, puisque Bob pose une question, il ne peut pas ajouter 「だ」 car dans ce cas, il affirmerait une chose tout en posant une question dessus.','ボブ：　ジムは明日？- Est Jim demain ?
アリス：　ジムは明日じゃない。- Jim pas demain.', 2),
('Puisque nous navons aucun contexte, il ny a pas assez dinformations pour donner un sens convenable à cette conversation.
Il est certain quaffirmer que Jim soit en réalité demain na aucun sens.
Dans un contexte donné, aussi longtemps quil existe un lien entre Jim et demain, la phrase peut signifier nimporte quoi.
Ils pourraient ainsi parler de la date dun examen.','アリス）　今日は試験だ。- Aujourdhui est examen.
ボブ）　ジムは？ - Et concernant Jim?
アリス）　ジムは明日。 - Jim est demain. (Pour Jim, lexamen est demain.)',2 ),
('Il est important de noter à quel point un sujet peut ne pas être spécifié.
Il peut se référer à nimporte quel objet ou action qui se trouve nimporte où dans la phrase énoncée, y compris celles qui ont déjà été dites.
Par exemple, dans la dernière phrase de la conversation ci-dessus, il nest nulle part fait mention du mot "examen" alors quil est question de lexamen de Jim !', null, 2),
('En général, les Japonais n’affirment pas quelque chose tant qu’ils ne sont pas absolument surs que c’est correct.
C’est ce qui est pris en compte pour l’usage incroyablement fréquent de 「～と思う」 et des diverses expressions grammaticales utilisées pour exprimer des niveaux spécifiques de certitude.
Nous allons voir ces expressions en partant du plus bas degré de certitude au plus haut.',null, 7),
('「かもしれない」 est utilisé pour dire "peut-être" ou "possiblement" et est moins certains que le mot 「多分」.
Il s’attache à la fin d’une proposition complète. Pour les noms et les adjectifs -na, le「だ」déclaratif doit être enlevé.
Il peut aussi être écrit en kanji comme 「かも知れない」 et vous pouvez le traiter de la même façon qu’un verbe en –u négatif (il n’y a pas d’équivalent positif) dès lors la forme en –masu deviendrait 「かもしれません」.
Dans le discourt informel, il peut être raccourci en 「かも」.
Il y a aussi une version très masculine 「かもしれん」, qui est simplement un différent type de verbe négatif vu ici.','（１）　スミスさんは食堂に行ったかもしれません。 - Il se pourrait que Smith san soit allé à la cafétéria.
（２）　雨で試合は中止になるかもしれないね。 - Il se pourrait que le jeu soit annulé pour la pluie, hein?
（３）　この映画は一回見たことあるかも！- Il se pourrait que j’aie déjà vu ce film une foi.
（４）　あそこが代々木公園かもしれない。- Par là il se pourrait que se soit Yoyogi Park.
（５）　もう逃げられないかもしれんぞ。- Il est probable que je ne puisse déjà plus m’échapper, tu sais.',8),
('「でしょう」 est utilisé pour exprimer un peut de certitude et est proche en signification 「多分」.
Tout comme 「～です／～ます」, il doit venir à la fin d’une phrase complète. Il n’a pas d’autre conjugaison.
 Vous pouvez aussi remplacer 「～ですか」 avec 「～でしょうか」 pour rendre la question légèrement plus polie et moins directe en ajoutant un léger niveau d’incertitude.','（１）　明日も雨でしょう。- Demain aussi il pleut (peut-être).
（２）　あなたは、学生さんでしょうか。- Seriez-vous l‘étudiant?
（３）　これからどこへ行くんでしょうか？- Par où iriez vous d’ici?', 9);

INSERT INTO theme (NAME, DESCRIPTION)
VALUES('Vocabulaire', 'vocabulaire'),
('Grammaire', 'Grammaire'),
('Dialogue', 'Dialogue');

INSERT INTO asset (type, value, asset_order)
VALUES('sound','https://drive.google.com/open?id=1nL2KxYCiug5bH6hJ-Plo6zSv2oJFG3N8', 1);

