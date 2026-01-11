package Documents;

public class CandidateResumeFactory extends DocumentFactory {

  @Override
  public BaseDocument createDocument(DocumentConfig config) {
    CandidateResume resume = new CandidateResume();
    return resume;
  }
}