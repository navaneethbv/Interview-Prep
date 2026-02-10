# Interview-Prep

A collection of interview-preparation solutions in Java.

## Structure

All Java source files are organized under `src/` in topic-based and company-based folders:

```text
Interview-Prep/
├── src/
│   ├── Codility/
│   ├── GeeksforGeeksPractice/
│   ├── LeetCodePractice/
│   ├── TopCoder/
│   ├── Warmup/
│   ├── ctci/
│   ├── geeksforgeeks/
│   ├── hackerRank/
│   ├── leetCode/
│   ├── misc/
│   ├── yelpInterview/
│   └── ... (and more)
└── README.md
```

## Running a file

From the repo root, compile into a dedicated output directory and then run, for example:

```bash
mkdir -p out
javac -d out src/Warmup/SimpleWordsSnapchatAssessment.java
java -cp out Warmup.SimpleWordsSnapchatAssessment
```
