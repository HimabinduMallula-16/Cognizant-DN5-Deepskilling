# Hands-On 1 Notes

## angular.json
Contains the Angular workspace configuration, including project settings, build options, assets, styles, and budgets.

---

## tsconfig.json
The base TypeScript configuration shared across the project.

---

## tsconfig.app.json
TypeScript compiler configuration specifically for the Angular application.

---

## package.json
Contains project metadata, dependencies, and npm scripts.

---

## src/main.ts
The entry point of the Angular application. It bootstraps the root Angular application.

---

## src/app/app.config.ts
Configures application-wide providers such as routing and dependency injection for standalone Angular applications.

---

## src/app/app.component.ts
The root component of the Angular application.

---

## src/index.html
The main HTML page where the Angular application is loaded.

---

## Angular Build Output

Running `ng build` creates a `dist/` folder.

The compiled application code is located in:

- `dist/student-course-portal/browser/main-xxxxx.js`

---

## Angular Budgets

Angular budgets help monitor bundle size.

- **maximumWarning** – Displays a warning when the bundle exceeds the configured size.
- **maximumError** – Fails the production build if the bundle exceeds the configured limit.