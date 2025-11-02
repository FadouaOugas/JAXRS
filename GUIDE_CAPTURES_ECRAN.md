# Guide des Captures d'Écran pour le TP

## 📸 Captures d'écran à faire pour montrer que le TP fonctionne

### 1. ✅ Console de démarrage de l'application

**Action :**
1. Démarrez l'application avec `mvn spring-boot:run` ou depuis votre IDE
2. Attendez que l'application soit complètement démarrée

**Capture d'écran :**
- Montre les logs de démarrage
- Doit afficher :
  - `Started JaxrsApplication in X.XXX seconds`
  - Les 3 comptes créés par le `CommandLineRunner` (avec leur id, solde, date, type)

**Nom du fichier :** `01-demarrage-application.png`

---

### 2. ✅ Console H2 - Connexion

**Action :**
1. Ouvrez votre navigateur
2. Allez sur `http://localhost:8082/h2-console`
3. Connectez-vous avec :
   - **JDBC URL** : `jdbc:h2:mem:banque`
   - **User Name** : `sa`
   - **Password** : (vide)

**Capture d'écran :**
- Montre la page de connexion H2 avec les informations remplies
- Doit montrer que vous êtes connecté

**Nom du fichier :** `02-h2-console-connexion.png`

---

### 3. ✅ Console H2 - Table COMPTE et données

**Action :**
1. Dans la console H2, exécutez cette requête :
   ```sql
   SELECT * FROM COMPTE;
   ```

**Capture d'écran :**
- Montre la requête SQL dans la zone de saisie
- Montre les résultats avec les 3 comptes (id, solde, dateCreation, type)
- Prouve que la base de données fonctionne et contient les données

**Nom du fichier :** `03-h2-table-compte.png`

---

### 4. ✅ GET tous les comptes en JSON (Postman)

**Action :**
1. Ouvrez Postman
2. Créez une nouvelle requête :
   - **Méthode** : `GET`
   - **URL** : `http://localhost:8082/banque/comptes`
   - **Header** : `Accept: application/json`
3. Cliquez sur "Send"

**Capture d'écran :**
- Montre la requête (méthode GET, URL)
- Montre le header `Accept: application/json`
- Montre le **statut 200 OK** (en vert)
- Montre le **corps de la réponse JSON** avec le tableau des comptes

**Nom du fichier :** `04-get-all-comptes-json.png`

---

### 5. ✅ GET tous les comptes en XML (Postman)

**Action :**
1. Dans Postman, même requête mais :
   - **Header** : `Accept: application/xml` (au lieu de JSON)

**Capture d'écran :**
- Montre la requête avec `Accept: application/xml`
- Montre le **statut 200 OK**
- Montre le **corps de la réponse XML** avec les comptes en format XML

**Nom du fichier :** `05-get-all-comptes-xml.png`

---

### 6. ✅ GET un compte par ID en JSON

**Action :**
1. Dans Postman :
   - **Méthode** : `GET`
   - **URL** : `http://localhost:8082/banque/comptes/1`
   - **Header** : `Accept: application/json`

**Capture d'écran :**
- Montre la requête avec l'ID dans l'URL
- Montre le statut 200 OK
- Montre **un seul compte** en JSON dans la réponse

**Nom du fichier :** `06-get-compte-by-id-json.png`

---

### 7. ✅ POST créer un compte en JSON

**Action :**
1. Dans Postman :
   - **Méthode** : `POST`
   - **URL** : `http://localhost:8082/banque/comptes`
   - **Headers** :
     - `Content-Type: application/json`
     - `Accept: application/json`
   - **Body** (raw JSON) :
     ```json
     {
       "solde": 5000.0,
       "dateCreation": "2024-11-02",
       "type": "COURANT"
     }
     ```

**Capture d'écran :**
- Montre la requête POST
- Montre le header `Content-Type: application/json`
- Montre le **body de la requête** (le JSON envoyé)
- Montre le **statut 200 OK** (ou 201 Created)
- Montre le **compte créé** dans la réponse JSON (avec son ID généré)

**Nom du fichier :** `07-post-create-compte-json.png`

---

### 8. ✅ POST créer un compte en XML

**Action :**
1. Même chose que précédemment mais :
   - **Headers** :
     - `Content-Type: application/xml`
     - `Accept: application/xml`
   - **Body** (raw XML) :
     ```xml
     <compte>
       <solde>7500.0</solde>
       <dateCreation>2024-11-02</dateCreation>
       <type>EPARGNE</type>
     </compte>
     ```

**Capture d'écran :**
- Montre la requête POST avec XML
- Montre le body XML envoyé
- Montre la réponse XML avec le compte créé

**Nom du fichier :** `08-post-create-compte-xml.png`

---

### 9. ✅ PUT mettre à jour un compte

**Action :**
1. Dans Postman :
   - **Méthode** : `PUT`
   - **URL** : `http://localhost:8082/banque/comptes/1`
   - **Headers** :
     - `Content-Type: application/json`
     - `Accept: application/json`
   - **Body** (raw JSON) :
     ```json
     {
       "solde": 10000.0,
       "dateCreation": "2024-11-02",
       "type": "EPARGNE"
     }
     ```

**Capture d'écran :**
- Montre la requête PUT avec l'ID dans l'URL
- Montre le body avec les nouvelles valeurs
- Montre la réponse avec le compte mis à jour

**Nom du fichier :** `09-put-update-compte.png`

---

### 10. ✅ DELETE supprimer un compte

**Action :**
1. Dans Postman :
   - **Méthode** : `DELETE`
   - **URL** : `http://localhost:8082/banque/comptes/1`
   - **Header** : `Accept: application/json`

**Capture d'écran :**
- Montre la requête DELETE
- Montre le statut 200 OK (ou 204 No Content)
- Montre la réponse vide (pas de body)

**Nom du fichier :** `10-delete-compte.png`

---

### 11. ✅ Vérification après DELETE dans H2

**Action :**
1. Retournez dans la console H2
2. Exécutez à nouveau : `SELECT * FROM COMPTE;`

**Capture d'écran :**
- Montre que le compte avec l'ID supprimé n'existe plus
- Prouve que le DELETE fonctionne vraiment

**Nom du fichier :** `11-h2-verification-apres-delete.png`

---

## 📝 Conseils pour les captures d'écran

1. **Clarté** : Assurez-vous que le texte est lisible
2. **Cadrage** : Montrez toutes les informations importantes (URL, méthode, headers, body, réponse)
3. **Organisation** : Nommez vos fichiers comme indiqué ci-dessus
4. **Qualité** : Utilisez des outils comme :
   - **Windows** : `Win + Shift + S` (Outil Capture d'écran)
   - **Snipping Tool** (Windows)
   - **Lightshot** (gratuit)
   - **Greenshot** (gratuit)

## 🎯 Résumé des captures essentielles (minimum)

Si vous n'avez pas le temps de toutes les faire, voici les **5 captures essentielles** :

1. ✅ Console de démarrage (montre l'initialisation)
2. ✅ Console H2 avec les données (montre que la BDD fonctionne)
3. ✅ GET tous les comptes en JSON (montre que l'API fonctionne)
4. ✅ GET tous les comptes en XML (montre le support XML)
5. ✅ POST créer un compte en JSON (montre l'opération CREATE)

Ces 5 captures prouvent que tout le TP fonctionne ! 🎉

