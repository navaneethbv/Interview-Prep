# Interview-Prep

A cleaned and reorganized collection of interview-preparation solutions in Java.

## What changed

- The repository was reorganized so all problem folders now live under `src/`.
- This keeps the project root clean and makes navigation simpler.

## New structure

```text
Interview-Prep/
├── src/
│   ├── Warmup/
│   ├── LeetCodePractice/
│   ├── ctci/
│   ├── geeksforgeeks/
│   ├── yelpInterview/
│   └── ... (other topic/company folders)
└── README.md
```

## Notes

- Existing Java package names and source contents were preserved.
- Only folder/file paths were reorganized.
- The previously fixed Snapchat simple words solution is now at:
  - `src/Warmup/SimpleWordsSnapchatAssessment.java`

## Running a file

From the repo root, compile and run by path, for example:

```bash
javac src/Warmup/SimpleWordsSnapchatAssessment.java
java -cp src Warmup.SimpleWordsSnapchatAssessment
```
