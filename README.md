# Interview-Prep

A cleaned and reorganized collection of interview-preparation solutions in Java.

## What changed

- The repository was reorganized so all problem folders now live under `src/`.
- This keeps the project root clean and makes navigation simpler.
- All files have been renamed to use descriptive names (e.g., `TwoSum.java`, `ArrayCheckPair.java`) instead of numeric prefixes (e.g., `_001TwoSum.java`, `_Array01CheckPair.java`).
- Class names have been updated to match the new filenames.

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
