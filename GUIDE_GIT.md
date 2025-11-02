# Guide pour pousser le TP sur Git

## Étapes pour pousser votre projet sur GitHub/GitLab

### 1. Créer un compte sur GitHub (si vous n'en avez pas)
- Allez sur https://github.com
- Créez un compte gratuit

### 2. Créer un nouveau dépôt sur GitHub
- Cliquez sur le bouton "+" en haut à droite → "New repository"
- Nommez-le (ex: `spring-tp2-jaxrs`)
- **Ne cochez PAS** "Initialize with README"
- Cliquez sur "Create repository"

### 3. Préparer votre projet local

#### Ajouter tous les fichiers
```bash
git add .
```

#### Faire votre premier commit
```bash
git commit -m "Initial commit: TP Spring Boot JAX-RS - Service REST avec H2"
```

### 4. Lier votre projet local à GitHub

Remplacez `VOTRE_USERNAME` et `NOM_DU_REPO` par vos valeurs :
```bash
git remote add origin https://github.com/VOTRE_USERNAME/NOM_DU_REPO.git
```

### 5. Pousser votre code
```bash
git branch -M main
git push -u origin main
```

Vous devrez entrer votre nom d'utilisateur et votre mot de passe/token GitHub.

## Commandes Git utiles

### Voir l'état des fichiers
```bash
git status
```

### Voir les fichiers modifiés
```bash
git diff
```

### Ajouter des fichiers modifiés
```bash
git add .
```

### Faire un commit
```bash
git commit -m "Votre message de commit"
```

### Pousser les changements
```bash
git push
```

### Voir l'historique
```bash
git log
```

