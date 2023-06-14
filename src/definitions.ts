export interface PreviewMemoryPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
